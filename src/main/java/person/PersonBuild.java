package person;

import person.models.Passport;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class PersonBuild {
    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;
    private Passport passport;

    public PersonBuild(String id){
        this.id = id;
    }
    
    public void getLastName() {
        this.lastName = lastName;
    }

    public void getFirstName() {
        this.firstName = firstName;
    }

    public void getMiddleName() {
        this.middleName = middleName;
    }

    public void getPhys() {
        this.phys = phys;
    }

    public void getAppearance() {
        this.appearance = appearance;
    }

    public void getPhone() {
        this.phone = phone;
    }

    public void getPassport() {
        this.passport = passport;
    }

    public Person build(){
        final Person person = new Person();
        person.id = this.id;
        person.lastName = this.lastName;
        person.firstName = this.firstName;
        person.middleName = this.middleName;
        person.appearance = this.appearance;
        person.phone = this.phone;
        person.phys = this.phys;
        person.passport = this.passport;
        return person;
    }
}
