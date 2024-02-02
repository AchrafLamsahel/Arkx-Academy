package org.ArkAcademy.week2.EncapInheritPolym.Challenge1LibrarySystem;

import java.util.Date;

public class TestLibrary {
    public static void main(String[] args) {
        Book fogitive = new Book("The Fogitive","MohammedAlli",120,120, new Date());
        Book noEscape = new Book("NoEscape","MOhammedAYoub",1200,89, new Date());
        Library library = new Library(12);
        library.addBook(fogitive);
        library.addBook(noEscape);
        library.displayAllBooks();


    }
}
