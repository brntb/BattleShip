package com.slinger;

import com.slinger.constants.ShipType;
import com.slinger.objects.CoordinateValidator;
import com.slinger.ships.*;

import java.util.Scanner;

//class makes all 5 ships
public class ShipMaker {

    private final CoordinateValidator validator;
    private final Scanner scanner;

    public ShipMaker(CoordinateValidator validator, Scanner scanner) {
        this.validator = validator;
        this.scanner = scanner;
    }


    public Ship makeAircraftCarrier() {
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

        return aircraft;
    }

    public Ship makeBattleship() {
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

        return battleShip;
    }

    public Ship makeSubmarine() {
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

        return submarine;
    }

    public Ship makeCruiser() {
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

        return cruiser;
    }

    public Ship makeDestroyer() {
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

        return destroyer;
    }
}
