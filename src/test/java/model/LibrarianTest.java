package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static enums.Gender.FEMALE;
import static enums.Role.LIBRARIAN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LibrarianTest {

    private Librarian librarian;

    @BeforeEach
    void librarianMethod() {
        librarian = new Librarian(1, "Olagoke", "Suliyat", FEMALE, LIBRARIAN);
    }

    @Test
    void testLibrarianMethodId() {
        assertEquals(1, librarian.getId());
    }

    @Test
    void testLibrarianMethodFirstName() {
        assertEquals("Olagoke", librarian.getFirstName());
    }

    @Test
    void testLibrarianMethodLastName() {
        assertEquals("Suliyat", librarian.getLastName());
    }

    @Test
    void testLibrarianMethodGender() {
        assertEquals(FEMALE, librarian.getGender());
    }

    @Test
    void testLibrarianMethodRole() {
        assertEquals(LIBRARIAN, librarian.getRole());
    }


}