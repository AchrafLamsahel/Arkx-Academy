package org.ArkAcademy.week2.EncapInheritPolym.Challenge1LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(int sizeLibrary) {
        this.bookList = new ArrayList<>(sizeLibrary);
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void displayAllBooks() {
        System.out.println("Library Books:");
        /*
        for (Book book : bookList) {
            if (book != null) {
                book.displayInfo();
                System.out.println("-----------------------");
            }
            }
            */
        bookList.forEach(book -> {
            book.displayInfo();
            System.out.println("-----------------------");
        });

    }
}
