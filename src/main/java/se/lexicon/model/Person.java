package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;

    private int sequencer = 0;

    private final String firstName;

    private final String lastName;

    private final List<Book> borrowedBooks;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int getNextId() {
        return id;
    }

    public String getPersonInformation() {
        return firstName + " " + lastName + " " + id + " " + borrowedBooks.toString();
    }

    public void loanBook(Book book) {
        if (!book.isAvailable()) return;
        borrowedBooks.add(book);
        book.setAvailable(false);
        book.setBorrower(this);
    }

    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book)) return;
        borrowedBooks.remove(book);
        book.setAvailable(true);
        book.setBorrower(null);
    }
}