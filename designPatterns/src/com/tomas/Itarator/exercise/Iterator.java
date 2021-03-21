package com.tomas.Itarator.exercise;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
