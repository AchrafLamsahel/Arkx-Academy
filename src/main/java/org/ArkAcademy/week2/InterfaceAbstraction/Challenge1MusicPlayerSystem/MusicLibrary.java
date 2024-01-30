package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Playable> tracks = new ArrayList<>();

    public List<Playable> getMusics(){
        return List.of(new Playable() {
            @Override
            public void play() {
                System.out.println("hey");
            }

            @Override
            public void pause() {
                System.out.println("Achraf");
            }

            @Override
            public void stop() {
                System.out.println("LAMSAHEL");
            }
        });
    }


    public void addTrack(Playable track) {
        tracks.add(track);
    }

    public void playTrack(Playable track) {
        track.play();
    }

    public void pauseTrack(Playable track) {
        track.pause();
    }

    public void stopTrack(Playable track) {
        track.stop();
    }

}
