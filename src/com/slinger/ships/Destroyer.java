package com.slinger.ships;

import com.slinger.constants.ShipType;
import com.slinger.objects.Coordinate;

public class Destroyer extends Ship {
    public Destroyer(Coordinate start, Coordinate end) {
        super(ShipType.DESTROYER.getLength(), start, end);
    }
}
