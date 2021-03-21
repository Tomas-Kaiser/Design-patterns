package com.tomas.Itarator.exercise;

public class Main {
    public static void main(String[] args){
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Birell"));
        productCollection.add(new Product(2, "Zlatopramen"));
        productCollection.add(new Product(3, "Kozel"));

        Iterator iterator = productCollection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}
