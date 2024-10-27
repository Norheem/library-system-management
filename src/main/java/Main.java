import model.Book;
import model.Librarian;
import model.Student;
import model.Teacher;
import service.impl.LibraryServiceImpl;

import static enums.Gender.*;
import static enums.Role.*;

public class Main {

    public static void main(String[] args) {


        //Create an instance of Book class
        Book book1 = new Book(1, "Things Fall Apart", "Chinua Achebe", 2);
        Book book2 = new Book(2, "Half of a yellow sun", "Chimamanda Adiche", 5);
        Book book3 = new Book(3, "The King's Horse man", "Wole Soyinka", 5);
        Book book4 = new Book(4, "Animal Farm", "George Orwell", 15);
        Book book5 = new Book(5, "Gifted Hands", "Ben Carson", 3);

        //Create an instance of Book class
        Librarian librarian1 = new Librarian(1, "Olagoke", "Suliyat", FEMALE, LIBRARIAN);
        Librarian librarian2 = new Librarian(2, "Asiwaju", "Taofeek", MALE, LIBRARIAN);

        //Create an instance of library Service
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        //Add book to library
        libraryService.addABook(librarian1, book1);
        libraryService.addABook(librarian2, book2);
        libraryService.addABook(librarian1, book3);
        libraryService.addABook(librarian2, book4);
        libraryService.addABook(librarian2, book5);

        //Create an instance of Student class
        Student junior1 = new Student(1, "Ojo", "Wale", MALE, JUNIOR_STUDENT);
        Student senior1 = new Student(2, "Ade", "Wale", MALE, SENIOR_STUDENT);
        Student junior2 = new Student(3, "Olabanji", "Nafeesat", FEMALE, JUNIOR_STUDENT);
        Student senior2 = new Student(4, "Olajide", "Mayokun", MALE, SENIOR_STUDENT);
        Student junior3 = new Student(5, "Adekile", "Omolara", FEMALE, JUNIOR_STUDENT);

        //Create an instance of Teacher class
        Teacher teacher1  = new Teacher(2, "Godwin", "Goke", MALE, TEACHER);
        Teacher teacher2 = new Teacher(4, "Adaeze", "Chidnma", FEMALE, TEACHER);


        // Add Person to library queue, junior => junior_student, senior => senior_student
        libraryService.addToQueue(junior1);
        libraryService.addToQueue(junior2);
        libraryService.addToQueue(junior3);
        libraryService.addToQueue(senior1);
        libraryService.addToQueue(senior2);
        libraryService.addToQueue(teacher1);
        libraryService.addToQueue(teacher2);

        System.out.println();
        System.out.println("When teacher, senior student and junior student and requesting for the same book");
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println();


        //Check for both senior student and junior student on the queue requesting for a book
        libraryService.addToQueue(junior1);
        libraryService.addToQueue(junior2);
        libraryService.addToQueue(junior3);
        libraryService.addToQueue(senior1);
        libraryService.addToQueue(senior2);


        System.out.println("When senior student and junior student are both requesting for the same book");
        System.out.println(libraryService.giveBook(librarian2, book2.getId(), book2.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian2, book2.getId(), book2.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian2, book2.getId(), book2.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian2, book2.getId(), book2.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian2, book2.getId(), book2.getBookTitle()));
        System.out.println();


        // check for teacher and senior student
        libraryService.addToQueue(senior1);
        libraryService.addToQueue(senior2);
        libraryService.addToQueue(teacher1);
        libraryService.addToQueue(teacher2);


        System.out.println("When teacher and senior student are both requesting for the same book");
        System.out.println(libraryService.giveBook(librarian1, book3.getId(), book3.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book3.getId(), book3.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book3.getId(), book3.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book3.getId(), book3.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book3.getId(), book3.getBookTitle()));
        System.out.println();


        System.out.println("When teacher, senior student and junior student and requesting for the same book");
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println(libraryService.giveBook(librarian1, book1.getId(),  book1.getBookTitle()));
        System.out.println();



        //Display using FIFO
        System.out.println("Implement FIFO");
        libraryService.implementFIFO(junior2);
        libraryService.implementFIFO(senior1);
        libraryService.implementFIFO(teacher1);
        System.out.println();
        System.out.println();
    }
}
