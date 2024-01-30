package org.ArkAcademy.week2.EncapInheritPolym.Challenge1LibrarySystem;

import java.util.Date;

public class FictionBook extends Book{
    private String genre;

    public FictionBook(String title, String author, int prix, int numberPage, Date datePublication,String genre) {
        super(title, author, prix, numberPage, datePublication);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
