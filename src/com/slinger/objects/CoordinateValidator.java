package com.slinger.objects;


import com.slinger.constants.ShipType;

//helper class to validate coordinates
public class CoordinateValidator {

    private final Board board;
    private Coordinate firstCoordinate;
    private Coordinate secondCoordinate;

    public CoordinateValidator(Board board) {
        this.board = board;
    }

    public boolean isValidCoordinates(String input, ShipType shipType) {
        String[] holder = input.split("\\s+");

        if (holder.length != 2) {
            System.out.println("\nNeeds two coordinates!\n");
            return  false;
        }

        String first = holder[0];
        String second = holder[1];

        firstCoordinate = new Coordinate(first);
        secondCoordinate = new Coordinate(second);

        //need to put coordinates in right order for example, I2 J2 and J2 I2 are valid pairs
        //if first coordinate comes after second, need to swap
        int firstLetter = firstCoordinate.getLetterPosition();
        int firstDigit = firstCoordinate.getDigitPosition();

        int secondLetter = secondCoordinate.getLetterPosition();
        int secondDigit = secondCoordinate.getDigitPosition();

        if (firstLetter == secondLetter && firstDigit > secondDigit || (firstLetter > secondLetter)) {
            Coordinate temp = firstCoordinate;
            firstCoordinate = secondCoordinate;
            secondCoordinate = temp;
        }

        //check for horizontal, vertical or diagonal coordinates
        if (isHorizontalCoordinates()) {
            return isValidHorizontalCoordinates(shipType);
        } else if (isVerticalCoordinates()) {
            return isValidVerticalCoordinates(shipType);
        } else {//user tried to enter ship that is a diagonal
            System.out.println("\nError! Wrong ship location! Try again:\n");
            return false;
        }

    }

    private boolean isValidHorizontalCoordinates(ShipType shipType) {
        int letterPosition = firstCoordinate.getLetterPosition();
        int currentRowPosition = firstCoordinate.getDigitPosition();
        int endRowPosition = secondCoordinate.getDigitPosition();

        //check valid ship length
        if (endRowPosition - currentRowPosition + 1 != shipType.getLength()) {
            System.out.println("\nError! Wrong length of the " + shipType.getName() +  "! Try again:\n");
            return false;
        }

        //check for open coordinates
        while (currentRowPosition <= endRowPosition) {
            if (!isCoordinateOpen(letterPosition, currentRowPosition)) {
                System.out.println("\nError! You placed it too close to another one. Try again:\n");
                return false;
            }

            currentRowPosition++;
        }

        return true;
    }


    private boolean isValidVerticalCoordinates(ShipType shipType) {
        int currentLetterPosition = firstCoordinate.getLetterPosition();
        int endLetterPosition = secondCoordinate.getLetterPosition();
        int rowPosition = firstCoordinate.getDigitPosition();

        //check valid ship length
        if (endLetterPosition - currentLetterPosition + 1 != shipType.getLength()) {
            System.out.println("\nError! Wrong length of the " + shipType.getName() + " ! Try again:\n");
            return false;
        }

        //check for open coordinates
        while (currentLetterPosition <= endLetterPosition) {
            if (!isCoordinateOpen(currentLetterPosition, rowPosition)) {
                System.out.println("\nError! You placed it too close to another one. Try again:\n");
                return false;
            }

            currentLetterPosition++;
        }

        return true;
    }

    //a coordinate is open if nothing occupies it to the top, right, bottom or left of the coordinate
    public boolean isCoordinateOpen(int letterPosition, int digitPosition) {

        //check above cell
        if (letterPosition != 0) { //ignore above cells for first row
            Cell aboveCell = board.getCell(letterPosition - 1, digitPosition);
            if (!aboveCell.isOpen()) {
                return false;
            }
        }

        //check left of cell
        if (digitPosition != 0) { //ignore left cells if on first column
            Cell leftCell = board.getCell(letterPosition, digitPosition - 1);
            if (!leftCell.isOpen()) {
                return false;
            }
        }

        //check right of cell
        if (digitPosition != 9) { //ignore right cells on last column
            Cell rightCell = board.getCell(letterPosition, digitPosition + 1);
            if (!rightCell.isOpen()) {
                return false;
            }
        }

        //check bottom of cell
        if (letterPosition != 9) { //ignore below cells on bottom row
            Cell belowCell = board.getCell(letterPosition + 1, digitPosition);
            return belowCell.isOpen();
        }

        return true;
    }

    //checks if two coordinates will make a horizontal ship
    private boolean isHorizontalCoordinates() {
        return firstCoordinate.getLetterPosition() == secondCoordinate.getLetterPosition();
    }

    //checks if two coordinates will make a vertical ship
    private boolean isVerticalCoordinates() {
        return firstCoordinate.getDigitPosition() == secondCoordinate.getDigitPosition();
    }

    public Coordinate getFirstCoordinate() {
        if (firstCoordinate == null) {
            throw new RuntimeException("Coordinate not set");
        }

        return firstCoordinate;
    }

    public Coordinate getSecondCoordinate() {
        if (secondCoordinate == null) {
            throw new RuntimeException("Coordinate not set");
        }
        return secondCoordinate;
    }
}
