package model;

import baseClass.Person;
import enums.Gender;
import enums.Role;

public class Teacher extends Person {

    //Constructor
    public Teacher(int id, String firstName, String lastName, Gender gender, Role role) {
        super(id, firstName, lastName, gender, role);
    }

}
