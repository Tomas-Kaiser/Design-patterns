package com.tomas.strategy;

public class HighContrast implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Apply high-contrast apply");
    }
}
