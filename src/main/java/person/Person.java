package person;

import person.models.Passport;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class Person {

    public String id;
    public String lastName;
    public String firstName;
    public String middleName;
    public Physical phys;
    public Appearance appearance;
    public Phone phone;
    public Passport passport;

    public Person() {
    }

    public Person(String id, String lastName, String firstName, String middleName,
                  Physical phys, Appearance appearance, Passport passport, Phone phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phys = phys;
        this.appearance = appearance;
        this.passport = passport;
        this.phone = phone;
    }

    @Override
    public final String toString() {
        return id + "\n" + lastName + "\n" + firstName + "\n" +
                middleName + "\n" + phys + "\n" + appearance + "\n" + passport + "\n" + phone;
    }
}
