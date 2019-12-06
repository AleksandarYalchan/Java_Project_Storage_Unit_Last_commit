package model;

import javax.persistence.*;

@MappedSuperclass
public class Person {
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public Person(){

    }
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +

                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
