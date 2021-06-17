package com.slinger.ships;

import com.slinger.constants.ShipType;
import com.slinger.objects.Coordinate;

public class AircraftCarrier extends Ship {

    public AircraftCarrier(Coordinate start, Coordinate end) {
        super(ShipType.AIRCRAFT_CARRIER.getLength(), start, end);
    }
}
