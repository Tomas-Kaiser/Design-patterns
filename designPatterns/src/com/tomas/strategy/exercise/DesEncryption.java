package com.tomas.strategy.exercise;

public class DesEncryption implements Encription {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}
