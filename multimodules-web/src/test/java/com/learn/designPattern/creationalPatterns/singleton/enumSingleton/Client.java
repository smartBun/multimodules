package com.learn.designPattern.creationalPatterns.singleton.enumSingleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(EnumSingleton.getInstance());
        System.out.println(EnumSingleton.getInstance());
    }
}
