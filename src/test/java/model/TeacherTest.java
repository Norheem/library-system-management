package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static enums.Gender.FEMALE;
import static enums.Role.TEACHER;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TeacherTest {
    
    private Teacher teacher;
    
    @BeforeEach
    void teacherMethod() {
        teacher = new Teacher(4, "Adaeze", "Chidnma", FEMALE, TEACHER);
    }

    @Test
    void testTeacherMethodId() {
        assertEquals(4, teacher.getId());
    }

    @Test
    void testTeacherMethodFirstName(){
        assertEquals("Adaeze", teacher.getFirstName());
    }

    @Test
    void testTeacherMethodLastName() {
        assertEquals("Chidnma", teacher.getLastName());
    }

    @Test
    void testTeacherMethodGender() {
        assertEquals(FEMALE, teacher.getGender());
    }

    @Test
    void testTeacherMethodRole() {
        assertEquals(TEACHER, teacher.getRole());
    }


}