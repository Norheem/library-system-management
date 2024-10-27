package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    void bookMethod() {
        book = new Book(1, "Things Fall Apart", "Chinua Achebe", 2);
    }

    @Test
    void testBookMethodId() {
        assertEquals(1, book.getId());
    }

    @Test
    void testBookMethodBookTitle() {
        assertEquals("Things Fall Apart", book.getBookTitle());
    }

    @Test
    void testBookMethodBookAuthor() {
        assertEquals("Chinua Achebe", book.getBookAuthor());
    }

    @Test
    void testBookMethodCopies() {
        assertEquals(2, book.getCopies());
    }

}