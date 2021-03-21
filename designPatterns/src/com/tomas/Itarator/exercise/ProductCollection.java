package com.tomas.Itarator.exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<Product> {
        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection){
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return (index < productCollection.products.size());
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
