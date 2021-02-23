package com.leon.base;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private int N;



    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0 ;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public Stack() {
        N = 0;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N ++;
    }
    public Item pop()
    {
        Item temp = first.item;
        first = first.next;
        N --;
        return temp;
    }
    public boolean isEmpty()
    {
        return N==0;
    }
    public int size()
    {
        return N;
    }
    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
}
