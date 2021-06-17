package com.slinger.ships;

import com.slinger.constants.ShipType;
import com.slinger.objects.Coordinate;

public class Cruiser extends Ship {

    public Cruiser(Coordinate start, Coordinate end) {
        super(ShipType.CRUISER.getLength(), start, end);
    }
}
