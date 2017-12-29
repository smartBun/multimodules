package com.list;

import java.util.*;

public class ListAddPerformance {
    private static final int N = 500000;

    private static long timeList(List list) {
        long start = System.currentTimeMillis();
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(0, o);
        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList time spent:" + timeList(new ArrayList()));
        System.out.println("LinkedList time spent:" + timeList(new LinkedList()));
    }
}  