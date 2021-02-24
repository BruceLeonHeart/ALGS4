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
        //return first==null;
    }
    public int size()
    {
        return N;
    }

}
