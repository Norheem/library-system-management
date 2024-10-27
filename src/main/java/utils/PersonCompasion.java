package utils;

import baseClass.Person;
import enums.Role;

import java.util.Comparator;

public class PersonCompasion implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getRole().equals(Role.TEACHER) && !p2.getRole().equals(Role.TEACHER)) {
            return -1; // p1 is a teacher, prioritize over p2
        } else if (!p1.getRole().equals(Role.TEACHER) && p2.getRole().equals(Role.TEACHER)) {
            return 1; //p2 is a teacher, prioritize over p1
        } else if (p1.getRole().equals(Role.SENIOR_STUDENT) && !p2.getRole().equals(Role.SENIOR_STUDENT)) {
            return -1; // p1 is a  senior student, prioritize over p2
        } else if (!p1.getRole().equals(Role.SENIOR_STUDENT) && p2.getRole().equals(Role.SENIOR_STUDENT)) {
            return 1; // p2 is a senior student, prioritize over p1
        } else if (p1.getRole().equals(Role.JUNIOR_STUDENT) && !p2.getRole().equals(Role.JUNIOR_STUDENT)) {
            return -1; // p1 is a  senior student, prioritize over p2
        } else if (!p1.getRole().equals(Role.JUNIOR_STUDENT) && p2.getRole().equals(Role.JUNIOR_STUDENT)) {
            return 1; // p2 is a senior student, prioritize over p1
        } else {
            return 0;
        }
    }
}
