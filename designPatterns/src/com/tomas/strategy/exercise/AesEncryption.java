package com.tomas.strategy.exercise;

public class AesEncryption implements Encription {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
