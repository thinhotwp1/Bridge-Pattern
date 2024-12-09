package org.example;

public class BridgePatternDemo {
    public static void main(String[] args) {
        // Bridge Pattern make a bridge with an interface
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new AdvancedRemoteControl(tv);
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);

        tvRemote.togglePower(); // TV is turned ON.
        tvRemote.adjustVolume(10); // TV volume set to 10

        radioRemote.togglePower(); // Radio is turned ON.
        radioRemote.adjustVolume(20); // Radio volume set to 20
    }
}
