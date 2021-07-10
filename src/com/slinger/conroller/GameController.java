package com.slinger.conroller;

import com.slinger.objects.Board;
import com.slinger.objects.Coordinate;
import com.slinger.objects.CoordinateValidator;
import com.slinger.objects.Player;

import java.util.Scanner;

public class GameController {

    private final Scanner scanner;
    private final CoordinateValidator validator;
    private final Player playerOne;
    private final Player playerTwo;

    public GameController(Board board, Scanner scanner) {
        validator = new CoordinateValidator(board);
        this.scanner =scanner;
        playerOne = new Player();
        playerTwo = new Player();
    }

    public void play() {
        System.out.println("Player 1, place your ships on the game field");
        playerOne.makeShips();

        System.out.println("\nPress Enter and pass the move to another player\n");
        scanner.nextLine();

        System.out.println("\nPlayer 2, place your ships on the game field");
        playerTwo.makeShips();

        System.out.println("Press Enter and pass the move to another player");
        scanner.nextLine();

        while (true) {
            playerOne.printRound();
            System.out.println("Player 1, it's your turn:");
            takeShotAt(playerTwo, playerOne);

            if (playerOne.hasWon()) {
                break;
            }

            System.out.println("Press Enter and pass the move to another player\n");
            scanner.nextLine();

            playerTwo.printRound();
            System.out.println("Player 2, it's your turn:");
            takeShotAt(playerOne, playerTwo);

            if (playerTwo.hasWon()) {
                break;
            }

            System.out.println("Press Enter and pass the move to another player\n");
            scanner.nextLine();

        }

    }


    //takes a shot at a ship and updates the board
    private void takeShotAt(Player playerToShootAT, Player currentPlayer) {
        System.out.println("\nTake a shot!\n");
        String shot;

        Board boardToShootAt = playerToShootAT.getPlayerBoard();

        while (true) {
            shot = scanner.nextLine();

            if (validator.isShotValid(shot)) {
                //this is terrible code, but only way to pass hyperskills weird rule, ie not tell a player a shot has already been made
                Coordinate coordinate = new Coordinate(shot);
                if (boardToShootAt.isHit(coordinate.getLetterPosition(), coordinate.getDigitPosition()) && boardToShootAt.getGuesses().contains(shot)) {
                    System.out.println("\nYou hit a ship!");
                    return;
                }

                boardToShootAt.addGuess(shot);
                break;
            } else {
                System.out.println("Error! You entered the wrong coordinates! Try again:");
            }
        }

        //shot is valid at this point, need to update board
        Coordinate coordinate = new Coordinate(shot);
        int letterPosition = coordinate.getLetterPosition();
        int digitPosition = coordinate.getDigitPosition();

        //update other players board with current players shot
        boardToShootAt.updateBoard(letterPosition, digitPosition);
        currentPlayer.getGuessBoard().updateBoard(letterPosition, digitPosition);

        boolean isMiss = boardToShootAt.isMiss(letterPosition, digitPosition);
        boolean isHit = boardToShootAt.isHit(letterPosition, digitPosition);
        boolean isSunk = false;

        //if hit, need to check if is sunk
        if (isHit) {
            isSunk = boardToShootAt.isSunk(letterPosition, digitPosition);
        }

        boolean isWon = boardToShootAt.isWon();

        //print guess board to current player
        boardToShootAt.printFoggedBoard();

        if (isWon) {
            System.out.println("\nYou sank the last ship. You won. Congratulations!");
        }else if (isSunk) {
            System.out.println("\nYou sank a ship! Specify a new target:\n");
        }else if (isMiss) {
            System.out.println("\nYou missed!");
        } else if (isHit) {
            System.out.println("\nYou hit a ship!");
        }

    }

}
