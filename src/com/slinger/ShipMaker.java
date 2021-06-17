package com.slinger;



import com.slinger.constants.ShipType;
import com.slinger.objects.Board;
import com.slinger.objects.CoordinateValidator;
import com.slinger.ships.*;
import com.slinger.ships.Ship;
import java.util.Scanner;

//class makes all 5 ships
public class ShipMaker {

    private final Board board;
    private final CoordinateValidator validator;
    private final Scanner scanner;

    public ShipMaker(Board board, CoordinateValidator validator, Scanner scanner) {
        this.board = board;
        this.validator = validator;
        this.scanner = scanner;
    }

    public void makeShips() {
        makeAircraftCarrier();
        makeBattleship();
        makeSubmarine();
        makeCruiser();
        makeDestroyer();
    }


    private void makeAircraftCarrier() {
        Ship aircraft;

        System.out.println("\nEnter the coordinates of the Aircraft Carrier (5 cells):\n");
        while (true) {
            String input = scanner.nextLine();

            boolean isValid = validator.isValidCoordinates(input, ShipType.AIRCRAFT_CARRIER);

            if (isValid) {
                aircraft = new AircraftCarrier(validator.getFirstCoordinate(), validator.getSecondCoordinate());
                break;
            }

        }

        board.addShip(aircraft);
        board.printBoard();
    }

    private void makeBattleship() {
        Ship battleShip;

        System.out.println("\nEnter the coordinates of the BattleShip Carrier (4 cells):\n");
        while (true) {
            String input = scanner.nextLine();

            boolean isValid = validator.isValidCoordinates(input, ShipType.BATTLESHIP);

            if (isValid) {
                battleShip = new Battleship(validator.getFirstCoordinate(), validator.getSecondCoordinate());
                break;
            }

        }

        board.addShip(battleShip);
        board.printBoard();
    }

    private void makeSubmarine() {
        Ship submarine;

        System.out.println("\nEnter the coordinates of the Submarine (3 cells):\n");
        while (true) {
            String input = scanner.nextLine();

            boolean isValid = validator.isValidCoordinates(input, ShipType.SUBMARINE);

            if (isValid) {
                submarine = new Submarine(validator.getFirstCoordinate(), validator.getSecondCoordinate());
                break;
            }

        }

        board.addShip(submarine);
        board.printBoard();
    }

    private void makeCruiser() {
        Ship cruiser;

        System.out.println("\nEnter the coordinates of the Cruiser (3 cells):\n");
        while (true) {
            String input = scanner.nextLine();

            boolean isValid = validator.isValidCoordinates(input, ShipType.CRUISER);

            if (isValid) {
                cruiser = new Cruiser(validator.getFirstCoordinate(), validator.getSecondCoordinate());
                break;
            }

        }

        board.addShip(cruiser);
        board.printBoard();
    }

    private void makeDestroyer() {
        Ship destroyer;

        System.out.println("\nEnter the coordinates of the Destroyer (2 cells):\n");
        while (true) {
            String input = scanner.nextLine();

            boolean isValid = validator.isValidCoordinates(input, ShipType.DESTROYER);

            if (isValid) {
                destroyer = new Destroyer(validator.getFirstCoordinate(), validator.getSecondCoordinate());
                break;
            }

        }

        board.addShip(destroyer);
        board.printBoard();
    }
}
