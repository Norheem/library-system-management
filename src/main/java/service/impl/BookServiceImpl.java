package service.impl;

import model.Book;
import service.BookService;

public class BookServiceImpl implements BookService {

    int bookLeft;
    @Override
    public void removeCopy(Book book) {
       bookLeft =  book.getCopies();
       if (bookLeft != 0){
           bookLeft--;
           book.setCopies(bookLeft);
       }
    }

    @Override
    public void addCopy(Book book) {
        bookLeft = book.getCopies();
        bookLeft++;
        book.setCopies(bookLeft);
    }
}
