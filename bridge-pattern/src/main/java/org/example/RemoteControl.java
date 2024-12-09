package org.example;

// Abstraction
abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void adjustVolume(int volume);
}