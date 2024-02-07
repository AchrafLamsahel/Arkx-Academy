package org.ArkAcademy.week3.FileIOSerrialization.challange;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Story {
    List<Sentence> sentences;

    public Story() {
        sentences = new ArrayList<>();
    }

    public void addSentence(String text, String author) {
        Sentence newSentence = new Sentence(text, author);
        sentences.add(newSentence);
    }

    public void saveProgress(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(sentences);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProgress(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            sentences = (List<Sentence>) ois.readObject();
            sentences.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
