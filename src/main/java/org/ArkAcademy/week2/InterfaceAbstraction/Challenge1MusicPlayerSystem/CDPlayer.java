package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public class CDPlayer extends AudioPlayer{
    private String cdName;

    public CDPlayer(String cdName) {
        this.cdName = cdName;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + cdName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD: " + cdName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD: " + cdName);
    }
}
