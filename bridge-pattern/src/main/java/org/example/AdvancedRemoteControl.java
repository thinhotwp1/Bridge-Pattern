package org.example;

// Refined Abstraction
class AdvancedRemoteControl extends RemoteControl {
    private boolean isOn = false;

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (isOn) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        isOn = !isOn;
    }

    @Override
    public void adjustVolume(int volume) {
        device.setVolume(volume);
    }
}