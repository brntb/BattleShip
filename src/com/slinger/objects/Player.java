package com.slinger.objects;

import com.slinger.ShipMaker;

import java.util.Scanner;

public class Player {

    //holds ships of the player
    private final Board playerBoard;
    private ShipMaker shipMaker;
    private final Board guessBoard;


    public Player() {
        this.playerBoard = new Board(10);
        this.guessBoard = new Board(10);
        shipMaker = new ShipMaker(new CoordinateValidator(playerBoard), new Scanner(System.in));
    }

    public void makeShips() {
        playerBoard.printBoard();

        playerBoard.addShip(shipMaker.makeAircraftCarrier());
        playerBoard.printBoard();

        playerBoard.addShip(shipMaker.makeBattleship());
        playerBoard.printBoard();

        playerBoard.addShip(shipMaker.makeSubmarine());
        playerBoard.printBoard();

        playerBoard.addShip(shipMaker.makeCruiser());
        playerBoard.printBoard();

        playerBoard.addShip(shipMaker.makeDestroyer());
        playerBoard.printBoard();
    }

    public void printRound() {
        guessBoard.printBoard();
        System.out.print("---------------------");
        playerBoard.printBoard();
    }

    public void printPlayerBoard() {
        playerBoard.printBoard();
    }

    public Board getPlayerBoard() {
        return playerBoard;
    }

    public Board getGuessBoard() {
        return guessBoard;
    }

    public boolean hasWon() {
        return playerBoard.isWon();
    }
}
