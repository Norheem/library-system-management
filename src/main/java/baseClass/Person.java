package baseClass;

import enums.Gender;
import enums.Role;

public abstract class Person {

    private int id;

    private String firstName;

    private String lastName;

    private Gender gender;

   private Role role;


   //Constructors
    public Person(int id, String firstName, String lastName, Gender gender, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.role = role;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}
