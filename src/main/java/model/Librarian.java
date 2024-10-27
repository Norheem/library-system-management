package model;

import baseClass.Person;
import enums.Gender;
import enums.Role;

public class Librarian extends Person {

    //Constructor
    public Librarian(int id, String firstName, String lastName, Gender gender, Role role) {
        super(id, firstName, lastName, gender, role);
    }


}
