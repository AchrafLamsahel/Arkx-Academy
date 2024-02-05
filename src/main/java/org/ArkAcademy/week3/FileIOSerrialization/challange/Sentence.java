package org.ArkAcademy.week3.FileIOSerrialization.challange;

import java.io.Serializable;

public class Sentence implements Serializable {
    String text;
    String author;

    public Sentence(String text, String author) {
        this.text = text;
        this.author = author;
    }
}
