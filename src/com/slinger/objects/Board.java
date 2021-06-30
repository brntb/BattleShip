package com.slinger.objects;

import com.slinger.constants.State;
import com.slinger.ships.Ship;

public class Board {

    private final Cell[][] board;
    private final int size;

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

        int letterPosition = start.getLetterPosition();
        int i = start.getDigitPosition();
        int j = end.getDigitPosition();

        while (i <= j) {
            board[letterPosition][i].setState(State.OCCUPIED);
            i++;
        }
    }

    private void addShipVertically(Ship ship) {
        Coordinate start = ship.getStartCoordinate();
        Coordinate end = ship.getEndCoordinate();

        int digitPosition  = start.getDigitPosition();
        int i = start.getLetterPosition();
        int j = end.getLetterPosition();

        while (i <= j) {
            board[i][digitPosition].setState(State.OCCUPIED);
            i++;
        }

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
        //check if already played
        if (board[x][y].getState().equals(State.HIT) || board[x][y].getState().equals(State.MISS)) {
            System.out.println("\nCell occupied!");
            return;
        }

        //check if miss
        if (board[x][y].isOpen()) {
            board[x][y].setState(State.MISS);
            System.out.println("\nYou missed!");
            return;
        }

        //check if hit
        if (board[x][y].getState().equals(State.OCCUPIED)) {
            board[x][y].setState(State.HIT);
            System.out.println("\nYou hit a ship!");
            return;
        }

    }

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



}
