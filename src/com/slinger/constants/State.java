package com.slinger.constants;

public enum State {
    FOG("~"),
    OCCUPIED("O"),
    HIT("X"),
    MISS("M");

    private final String symbol;

    State(String symbol) {
        this.symbol = symbol;
    }

    public String getState() {
        return this.symbol;
    }
}
