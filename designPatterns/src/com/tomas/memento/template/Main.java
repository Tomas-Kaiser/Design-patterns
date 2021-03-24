package com.tomas.memento.template;

public class Main {
    public static void main(String[] args){
        var moneyTask = new TransferMoneyTask();
        moneyTask.execute();
    }
}
