package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public abstract class AudioPlayer implements Playable {
    private int volume;

    public AudioPlayer() {
        this.volume = 50; // Default volume
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
