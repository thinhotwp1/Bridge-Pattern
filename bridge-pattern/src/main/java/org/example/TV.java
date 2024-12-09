package org.example;

// Concrete Implementor
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}