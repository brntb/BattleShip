package com.slinger.ships;

import com.slinger.constants.ShipType;
import com.slinger.objects.Coordinate;

public class Battleship extends Ship {

    public Battleship(Coordinate start, Coordinate end) {
        super(ShipType.BATTLESHIP.getLength(), start, end);
    }

}
