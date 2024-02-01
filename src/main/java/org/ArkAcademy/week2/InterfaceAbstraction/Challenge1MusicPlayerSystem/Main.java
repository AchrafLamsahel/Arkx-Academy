package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MP3Player mp3Player = new MP3Player("song.mp3");
        CDPlayer cdPlayer = new CDPlayer("Album CD");

        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.setTrack(mp3Player);
        musicLibrary.playTrack();
        musicLibrary.pauseTrack();
        musicLibrary.stopTrack();

        musicLibrary.setTrack(cdPlayer);
        musicLibrary.playTrack();
        musicLibrary.pauseTrack();
        musicLibrary.stopTrack();
    }

}
