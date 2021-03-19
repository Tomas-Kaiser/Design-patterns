package com.tomas.state;

public class Main {

    public static void main(String[] args){
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
