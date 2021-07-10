package com.slinger.objects;


import com.slinger.constants.State;
import com.slinger.ships.Ship;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final Cell[][] board;
    private final int size;
    private int sunkShipCount;
    private final List<List<Cell>> shipsLocations = new ArrayList<>();
    private final List<String> guesses = new ArrayList<>();

    public Board(int size) {
        this.size = size;
        this.board = new Cell[this.size][this.size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public void addShip(Ship ship) {
        if (isShipHorizontal(ship)) {
            addShipHorizontally(ship);
        } else {
            addShipVertically(ship);
        }
    }

    private void addShipHorizontally(Ship ship) {
        Coordinate start = ship.getStartCoordinate();
        Coordinate end = ship.getEndCoordinate();
        List<Cell> shipCoordinates = new ArrayList<>();


        int letterPosition = start.getLetterPosition();
        int i = start.getDigitPosition();
        int j = end.getDigitPosition();

        while (i <= j) {
            board[letterPosition][i].setState(State.OCCUPIED);
            shipCoordinates.add(board[letterPosition][i]);
            i++;
        }

        shipsLocations.add(shipCoordinates);
    }

    private void addShipVertically(Ship ship) {
        Coordinate start = ship.getStartCoordinate();
        Coordinate end = ship.getEndCoordinate();
        List<Cell> shipCoordinates = new ArrayList<>();

        int digitPosition = start.getDigitPosition();
        int i = start.getLetterPosition();
        int j = end.getLetterPosition();

        while (i <= j) {
            board[i][digitPosition].setState(State.OCCUPIED);
            shipCoordinates.add(board[i][digitPosition]);
            i++;
        }

        shipsLocations.add(shipCoordinates);
    }

    private boolean isShipHorizontal(Ship ship) {
        Coordinate start = ship.getStartCoordinate();
        Coordinate end = ship.getEndCoordinate();

        return start.getLetterPosition() == end.getLetterPosition();
    }

    public Cell getCell(int x, int y) {
        return board[x][y];
    }

    //returns true if position has not been played, else returns false if user tries to enter a cell already hit
    public void updateBoard(int x, int y) {
        //check if miss
        if (board[x][y].isOpen()) {
            board[x][y].setState(State.MISS);
            return;
        }

        //check if hit
        if (board[x][y].getState().equals(State.OCCUPIED)) {
            board[x][y].setState(State.HIT);
        }
    }

    public boolean isMiss(int x, int y) {
        return board[x][y].getState() == State.MISS;
    }

    public boolean isHit(int x, int y) {
        return board[x][y].getState() == State.HIT;
    }

    public boolean isSunk(int x, int y) {
        Cell cell = getCell(x, y);

        for (List<Cell> cells : shipsLocations) {
            if (cells.contains(cell)) {
                for (Cell current : cells) {
                    if (current.getState() != State.HIT) {
                        return false;
                    }
                }
            }
        }

        sunkShipCount++;
        return true;
    }

    public int getSunkShipCount() {
        return sunkShipCount;
    }

    public boolean isWon() {
        return sunkShipCount == 5;
    }

    public boolean shotIsOpen(String shot) {
        Coordinate coordinate = new Coordinate(shot);

        System.out.println(getCell(coordinate.getLetterPosition(), coordinate.getDigitPosition()).getState());

        return getCell(coordinate.getLetterPosition(), coordinate.getLetterPosition()).getState() == State.FOG;
    }

    //prints the whole board with ships and player guesses
    public void printBoard() {
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10");
        char currentLetter = 'A';
        for (int i = 0; i < size; i++) {
            System.out.print(currentLetter + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            currentLetter++;
        }
    }

    public void printFoggedBoard() {
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10");
        char currentLetter = 'A';
        for (int i = 0; i < size; i++) {
            System.out.print(currentLetter + " ");
            for (int j = 0; j < size; j++) {
                State currentState = board[i][j].getState();

                if (currentState == State.HIT || currentState == State.MISS) {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print(State.FOG.getState() + " ");
                }

            }
            System.out.println();
            currentLetter++;
        }
    }

    public void addGuess(String shot) {
        guesses.add(shot);
    }

    public List<String> getGuesses() {
        return guesses;
    }
}
