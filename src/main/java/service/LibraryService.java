package service;

import baseClass.Person;
import model.Book;
import model.Librarian;

public interface LibraryService {

    void addToQueue(Person person);

    void implementFIFO(Person person);

    void addABook(Librarian librarian, Book book);

    String giveBook(Librarian librarian, int bookId, String bookTitle);

}
