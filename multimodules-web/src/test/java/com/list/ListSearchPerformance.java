package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSearchPerformance {
    private static final int N = 50000;

    private static List values;

    static {
        Integer values[] = new Integer[N];

        Random r = new Random();

        for (int i = 0, currentValue = 0; i < N; i++) {
            values[i] = currentValue;
            currentValue += r.nextInt(100) + 1;
        }

        ListSearchPerformance.values = Arrays.asList(values);
    }

    private static long timeList(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int index = Collections.binarySearch(list, values.get(i));
            if (index != i) {
                System.out.println("*** Error ***");
            }
        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String args[]) {
        System.out.println("ArrayList time spent：" + timeList(new ArrayList(values)) + " ms");
        System.out.println("LinkedList time spent：" + timeList(new LinkedList(values)) + "ms");
    }
}  