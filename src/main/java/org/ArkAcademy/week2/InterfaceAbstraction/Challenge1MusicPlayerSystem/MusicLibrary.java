package org.ArkAcademy.week2.InterfaceAbstraction.Challenge1MusicPlayerSystem;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private Playable currentTrack;

    public void setTrack(Playable track) {
        this.currentTrack = track;
    }

    public void playTrack() {
        if (currentTrack != null) {
            currentTrack.play();
        } else {
            System.out.println("No track selected.");
        }
    }

    public void pauseTrack() {
        if (currentTrack != null) {
            currentTrack.pause();
        } else {
            System.out.println("No track selected.");
        }
    }

    public void stopTrack() {
        if (currentTrack != null) {
            currentTrack.stop();
        } else {
            System.out.println("No track selected.");
        }
    }
}
