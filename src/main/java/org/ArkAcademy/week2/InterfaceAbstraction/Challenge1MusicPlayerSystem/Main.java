package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addTrack(mp3Player);
        musicLibrary.addTrack(cdPlayer);

        for (Playable track : musicLibrary.getMusics()) {
            musicLibrary.playTrack(track);
            musicLibrary.pauseTrack(track);
            musicLibrary.stopTrack(track);
        }

    }
}