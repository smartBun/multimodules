package com.learn.designPattern.behavioralPatterns.state;

public class PowerOnState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("Already Power On");
    }
    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }
    @Override
    public void preSong() {
        System.out.println("Pre Song");
    }
    @Override
    public void nextSong() {
        System.out.println("Next Song");
    }
}