package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public class CDPlayer extends AudioPlayer{
    @Override
    public void play() {
        System.out.println("Playing CD");
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD");
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD");
    }
}
