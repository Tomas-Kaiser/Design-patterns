package com.tomas.strategy.exercise;

public class ChatClient {
    public void send(String message, Encription encryptionAlgorithm) {
        try {
            encryptionAlgorithm.encrypt("message");
        } catch (Exception e){
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }

        System.out.println("Sending the encrypted message...");
    }
}
