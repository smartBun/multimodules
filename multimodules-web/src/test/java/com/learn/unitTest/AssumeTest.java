package com.learn.unitTest;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class AssumeTest {

    @DataPoints
    public static String[] names = {"LiLei", "HanMeiMei"};

    @DataPoints
    public static int[] ages = {10, -2, 12};

    @Theory
    public void printAge(String name, int age) {
        Assume.assumeTrue(age > 0);
        System.out.println(String.format("%s's Name is %s.", name, age));
    }
}