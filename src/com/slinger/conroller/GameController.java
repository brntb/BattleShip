package com.slinger.conroller;

import com.slinger.ShipMaker;
import com.slinger.objects.Board;
import com.slinger.objects.Coordinate;
import com.slinger.objects.CoordinateValidator;
import java.util.Scanner;

public class GameController {

    private final Board board;
    private final ShipMaker shipMaker;
    private final Scanner scanner;
    private final CoordinateValidator validator;

    public GameController(Board board, Scanner scanner) {
        this.board = board;
        validator = new CoordinateValidator(board);
        this.scanner =scanner;
        shipMaker = new ShipMaker(board, validator, scanner);
    }

    public void play() {
        board.printBoard();
        shipMaker.makeShips();
        System.out.println("\nThe game starts!");
        board.printBoard();
        takeShot();

    }

    private void takeShot() {
        System.out.println("\nTake a shot!\n");
        String shot;

        while (true) {
            shot = scanner.nextLine();
            if (validator.isShotValid(shot)) {
                break;
            } else {
                System.out.println("Error! You entered the wrong coordinates! Try again:");
            }
        }

        //shot is valid at this point, need to update board
        Coordinate coordinate = new Coordinate(shot);
        int letterPosition = coordinate.getLetterPosition();
        int digitPosition = coordinate.getDigitPosition();

        board.updateBoard(letterPosition, digitPosition);
        board.printBoard();
    }




}
