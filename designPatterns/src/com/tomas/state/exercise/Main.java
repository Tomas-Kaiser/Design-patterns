package com.tomas.state.exercise;

public class Main {
    public static void main(String[] args){
        DirectionService ds = new DirectionService();
        ds.setTravelMode(new Walking());
        ds.getEta();
        ds.getDirection();
    }
}
