package com.tomas.strategy;

public class Main {
    public static void main(String[] args){
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("fileName", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("anotherFileName", new PngCompressor(), new HighContrast());
    }
}
