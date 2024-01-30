package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public class MP3Player extends AudioPlayer{
    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 file");
    }
}
