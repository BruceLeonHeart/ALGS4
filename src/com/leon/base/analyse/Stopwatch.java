package com.leon.base.analyse;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class Stopwatch {
    private final long start;
    public Stopwatch() {
        start = System.currentTimeMillis();
    }
    public double elapseTime(){
        long now = System.currentTimeMillis();
        return (now - start)/1000.0;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000,1000000);
        }
        Stopwatch watch = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = watch.elapseTime();
        StdOut.println(cnt + " triples takes " + time + " secs.");
    }
}
