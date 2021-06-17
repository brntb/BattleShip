package com.slinger.ships;


import com.slinger.objects.Coordinate;

public abstract class Ship {

    private final int length;
    private final Coordinate startCoordinate;
    private final Coordinate endCoordinate;

    public Ship(int length, Coordinate start, Coordinate end) {
        this.length = length;
        this.startCoordinate = start;
        this.endCoordinate = end;
    }

    public int getLength() {
        return length;
    }

    public Coordinate getStartCoordinate() {
        return startCoordinate;
    }

    public Coordinate getEndCoordinate() {
        return endCoordinate;
    }
}
