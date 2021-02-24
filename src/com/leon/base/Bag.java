package com.leon.base;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private int N;


    public Bag() {
        N = 0;
    }

    void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;

    }

    boolean isEmpty(){
        return N==0;
    }

    int size(){
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }

    public static void main(String[] args) {

    }
}
