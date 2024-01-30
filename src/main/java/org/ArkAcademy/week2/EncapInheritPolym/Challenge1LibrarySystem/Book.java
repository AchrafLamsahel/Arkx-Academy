package org.ArkAcademy.week2.EncapInheritPolym.Challenge1LibrarySystem;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private int prix;
    private int numberPage;
    private Date datePublication;

    public Book(String title, String author, int prix, int numberPage, Date datePublication) {
        this.title = title;
        this.author = author;
        this.prix = prix;
        this.numberPage = numberPage;
        this.datePublication = datePublication;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("prix: " + prix);
        System.out.println("numberPage: " + numberPage);
        System.out.println("datePublication: " + datePublication);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
}
