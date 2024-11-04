package model;

import baseClass.Person;
import utils.PersonComparison;

import java.util.*;

public class Library {

    //Create HashMap<>
    private HashMap<String, List<Book>> bookOnShelf;

    //Create a priority queue for person on the queue
    PriorityQueue<Person> personOnQueue;

    private final Queue<Person> useFifoToAssignBook;


    //Create a Set to track if book already exist in library
    private Set<Integer> isIdBookExist = new HashSet<>();

    // Create a library constructor
    public Library() {
        bookOnShelf = new HashMap<>();
        personOnQueue = new PriorityQueue<>(new PersonComparison());
        useFifoToAssignBook = new LinkedList<>();
    }

    // Create Getter for book on shelf
    public HashMap<String, List<Book>> getBookOnShelf() {
        return bookOnShelf;
    }

    // Create Getter for person on queue
    public PriorityQueue<Person> getPersonOnQueue() {
        return personOnQueue;
    }

    // Create Getter for bookIdExist in library
    public Set<Integer> getIsIdBookExist() {
        return isIdBookExist;
    }

    // Create getter for FiFo
    public Queue<Person> getListUsingFifo() {
        return useFifoToAssignBook;
    }

}

