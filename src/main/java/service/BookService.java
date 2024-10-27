package service;

import model.Book;

public interface BookService {

    void removeCopy(Book book);
    void addCopy(Book book);
}
