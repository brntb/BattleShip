package com.slinger.ships;

import com.slinger.constants.ShipType;
import com.slinger.objects.Coordinate;

public class Submarine extends Ship {

    public Submarine(Coordinate start, Coordinate end) {
        super(ShipType.SUBMARINE.getLength(), start, end);
    }

}
