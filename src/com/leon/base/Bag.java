package com.leon.base;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    public Bag() {
    }

    void add(Item item){

    }

    boolean isEmpty(){
        return false;
    }

    int size(){
        return 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {

    }
}
