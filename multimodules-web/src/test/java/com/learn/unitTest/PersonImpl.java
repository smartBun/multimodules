package com.learn.unitTest;

public class PersonImpl implements Person {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String talkTo(String message) {
        return message;
    }

    @Override
    public void walk() {
        System.out.println("I'm walking.");
    }
}
