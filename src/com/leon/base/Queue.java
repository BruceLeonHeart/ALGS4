package com.leon.base;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;

    public Queue() {
        N = 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>{
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
    void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first =last;
        else oldlast.next = last;
        N ++;
    }

    Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;

    }

    boolean isEmpty(){
        return N==0;
        //return first==null;
    }

    int size(){
        return 0;
    }

}
