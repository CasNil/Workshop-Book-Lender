package se.lexicon.model;

import java.util.UUID;

public class Book {
    private String id;

    private String title;

    private String author;

    private boolean available;

    private Person borrower;


    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        return "id: " + id + "," + title + " " + author + " " + available;
    }

    @Override
    public String toString() {
        return getBookInformation();
    }
}


