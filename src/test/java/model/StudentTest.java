package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static enums.Gender.MALE;
import static enums.Role.JUNIOR_STUDENT;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void studentMethod() {
        student = new Student(1, "Ojo", "Wale", MALE, JUNIOR_STUDENT);
    }

    @Test
    void testStudentMethodId() {
        assertEquals(1, student.getId());
    }

    @Test
    void testStudentMethodFirstName(){
        assertEquals("Ojo", student.getFirstName());
    }

    @Test
    void testStudentMethodLastName() {
        assertEquals("Wale", student.getLastName());
    }

    @Test
    void testStudentMethodGender() {
        assertEquals(MALE, student.getGender());
    }

    @Test
    void testStudentMethodRole() {
        assertEquals(JUNIOR_STUDENT, student.getRole());
    }

}