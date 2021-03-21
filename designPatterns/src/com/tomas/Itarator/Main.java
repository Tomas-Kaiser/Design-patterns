package com.tomas.Itarator;

public class Main {
    public static void main(String[] args){
        var browserHistory = new BrowserHistory();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");

        Iterator iterator = browserHistory.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
