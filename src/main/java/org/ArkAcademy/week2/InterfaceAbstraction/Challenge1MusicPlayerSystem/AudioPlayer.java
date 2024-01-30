package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public abstract class AudioPlayer implements Playable {
    private int volume = 50;

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Invalid volume level");
        }
    }
    public int getVolume() {
        return volume;
    }
}
