package com.leon.base;

public class FixedCapacityStack <Item>{
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap) {
        a = (Item[])new Object[cap];
        N = 0;
    }

    public void push(Item item){
        a[N++] = item;
        // a[N] = item;
        // N+=1;
    }

    public Item pop(){
        Item item = a[--N];
        // N-=1;
        // a[N] = item;
        return item;
    }
    public boolean isEmpty()
    {
        return N==0;
    }
    public int size()
    {
        return N;
    }
    public boolean isFull(){
        return N==a.length;
    }
}
