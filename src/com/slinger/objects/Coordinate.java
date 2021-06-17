package com.slinger.objects;

/*
* Coordinates are made up of a uppercase letter and a digit
* With this application, letters are A - J and digits 1 - 10
 */
public class Coordinate {

    private final String letter;
    private final int digit;

    //used when passed a string like "A4"
    public Coordinate(String coordinate) {

        String[] holder = coordinate.split("");
        this.letter = holder[0];

        //check if Coordinate is made up of single digit or two digit number
        if (holder.length == 2) { //A5
            this.digit = Integer.parseInt(holder[1]);
        } else { //A10
            this.digit = Integer.parseInt(holder[1] + holder[2]);
        }
    }

    //translates the coordinate letter to a position Java can understand
    //A -> 0, B -> 1 and so on
    public int getLetterPosition() {
        char c = letter.charAt(0);

        return (int) c - 65;
    }

    //translates the digit to a position Java can understand
    public int getDigitPosition() {
        return digit - 1;
    }

    @Override
    public String toString() {
        return this.letter + this.digit;
    }
}
