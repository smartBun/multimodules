package com.learn.designPattern.behavioralPatterns.state;

public class PowerOffState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("Power On");
    }
    @Override
    public void powerOff() {
    }
    @Override
    public void preSong() {
    }
    @Override
    public void nextSong() {
    }
}