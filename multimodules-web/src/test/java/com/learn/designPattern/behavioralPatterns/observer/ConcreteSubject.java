package com.learn.designPattern.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Jack");
        Student s2 = new Student("Nic");
        Student s3 = new Student("Rose");

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(s1);
        concreteSubject.attach(s2);
        concreteSubject.attach(s3);
        concreteSubject.notify("Merry Christmas!");
    }
}
