package com.list;

import java.util.ArrayList;
import java.util.List;

public class SublistTest {
    public static void main(String[] args) {
        //testList();
        System.out.println();
    }

    private static void testList() {
        ArrayList<String> oldList = new ArrayList<>();
        oldList.add("aaa");
        oldList.add("bbb");
        oldList.add("ccc");
        oldList.add("ddd");

        List<String> subList = oldList.subList(2, 3);

        subList.add("eee");

        System.out.println(oldList);
        System.out.println(subList);

//        oldList.remove("aaa");
//
//        System.out.println(oldList);
//        System.out.println(subList);

        subList.clear();

        System.out.println(oldList);
        System.out.println(subList);
    }
}
