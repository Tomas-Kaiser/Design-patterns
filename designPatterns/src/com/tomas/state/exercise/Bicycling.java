package com.tomas.state.exercise;

public class Bicycling implements ITravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
