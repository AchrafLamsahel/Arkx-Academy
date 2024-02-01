package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

public class MP3Player extends AudioPlayer{
    private String mp3FileName;

    public MP3Player(String mp3FileName) {
        this.mp3FileName = mp3FileName;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file: " + mp3FileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file: " + mp3FileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 file: " + mp3FileName);
    }
}
