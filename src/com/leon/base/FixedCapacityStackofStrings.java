package com.leon.base;



public class FixedCapacityStackofStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackofStrings(int cap) {
        a = new String[cap];
        N = 0;
    }

    public void push(String item){
        a[N++] = item;
        // a[N] = item;
        // N+=1;
    }

    public String pop(){
        String item = a[--N];
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
