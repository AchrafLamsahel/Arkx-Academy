package org.ArkAcademy.week2.EncapInheritPolym.Challenge1LibrarySystem;

import java.util.Date;

public class NonFictionBook extends Book{
    private String category;
    public NonFictionBook(String title, String author, int prix, int numberPage, Date datePublication,String category) {
        super(title, author, prix, numberPage, datePublication);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: " + category);
    }
}
