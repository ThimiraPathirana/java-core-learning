package com.example.demo.generics;

import java.io.Serializable;

/**
 * can restrict Counter class extending with 'Number'.
 * can extends interface from one or more not implement
 * first come class then interface
 * @param <T>
 */
public class Counter<T extends Number & Serializable> {

    T t;

    Counter(T t) {
        this.t = t;
    }

    public void printCount() {
        System.out.println(t);
    }
}
