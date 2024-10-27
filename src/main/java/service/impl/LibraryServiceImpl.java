package service.impl;

import baseClass.Person;
import model.Book;
import model.Librarian;
import model.Library;
import service.LibraryService;

import java.util.*;

public class LibraryServiceImpl implements LibraryService {

    Library library = new Library();

    private final HashMap<String, List<Book>> booksList = library.getBookOnShelf();

    private final Set<Integer> isExist = library.getIsIdBookExist();


    @Override
    public void addABook(Librarian librarian, Book book) {

        if (isExist.contains(book.getId())) {
            System.out.println();
            System.out.println("Book Id " + book.getId() + " is already used by another book in the library");
            return;
        }

        isExist.add(book.getId());

            List<Book> listOfBook = booksList.get(book.getBookTitle());
            if (listOfBook == null){
                listOfBook = new ArrayList<>();
                booksList.put(book.getBookTitle(), (List<Book>) listOfBook);
            }

            listOfBook.add(book);
        }



    @Override
    public void addToQueue(Person person) {
        library.getPersonOnQueue().add(person);
    }

    @Override
    public void implementFIFO(Person person) {
        library.getListUsingFifo().add(person);

        Iterator<Person> iterator = library.getListUsingFifo().iterator();

        while (iterator.hasNext()) {
            String name = String.valueOf(iterator.next());
            System.out.println("This is using FIFO implementation " + name);
        }
    }


    //This method give user book and subtract book from available book copies
    @Override
    public String giveBook(Librarian librarian, int bookId, String bookTitle) {

        List<Book> listOfBooksInLibrary = library.getBookOnShelf().get(bookTitle);

        Queue<Person> theQueue = library.getPersonOnQueue();


        // Check if the queue is empty
        if (theQueue.isEmpty()) {
            return "No one is at the library to borrow book";
        }

        if (listOfBooksInLibrary == null || listOfBooksInLibrary.isEmpty()) {
            return "Book id " + bookId + ": " + " is already assigned to another, give the book another id";
        }

        Book availableBook = null;
        for (Book book : listOfBooksInLibrary) {
            if (book.getId() == bookId && book.getCopies() > 0) {
                availableBook = book;
                break;
            }
        }

        // Handle cases where the specific book ID is unavailable or has no copies
        if (availableBook == null) {
            return "Book with ID " + bookId + " and title " + bookTitle + " is either not available or all copies are borrowed.";
        }


        //Create a person to be added to queue
        Person nextPersonOnQueue = theQueue.poll();


        // Create a bookserviceimpl to remove copy borrowed from book available in library
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.removeCopy(availableBook);

        return "Book Id : " + bookId + " with title " + availableBook.getBookTitle() + " has been given to " + nextPersonOnQueue.getFirstName() + " " + nextPersonOnQueue.getLastName() +
                " and the " + nextPersonOnQueue.getRole() + " by the " + librarian.getFirstName() + " " + librarian.getLastName() + " who is the " + librarian.getRole();
    }


}
