package com.slinger.objects;

import com.slinger.constants.State;

public class Cell {

    private State state;

    public Cell() {
        this.state = State.FOG;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isOpen() {
        return this.state.equals(State.FOG);
    }

    @Override
    public String toString() {
        return this.state.getState();
    }
}
