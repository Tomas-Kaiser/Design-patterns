package com.tomas.strategy.exercise;

public class Main {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient();
        chatClient.send("Tadaa", new AesEncryption());
    }
}
