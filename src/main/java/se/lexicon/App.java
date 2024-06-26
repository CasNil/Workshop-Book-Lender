package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {


        // todo: needs completion

        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        System.out.println(book1.getBookInformation());

        System.out.println("--------------------------");
        Person person1 = new Person("Casper", "Nilsson");
        System.out.println(person1.getPersonInformation());
        person1.loanBook(book1);

        System.out.println("--------------------------");
        System.out.println(person1.getPersonInformation());
        System.out.println(book1.getBookInformation());
        person1.returnBook(book1);

        System.out.println("--------------------------");
        System.out.println(person1.getPersonInformation());
        System.out.println(book1.getBookInformation());
    }

}
