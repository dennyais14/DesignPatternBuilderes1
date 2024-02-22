public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private Integer age;

    public PersonBuilder() {}

    public PersonBuilder setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLasttName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Person build(){
        return new Person(firstName, lastName, "", 18);
    }
}
