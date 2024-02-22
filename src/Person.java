//Crea una classe Person con i campi firstName, lastName,
// age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private Integer age;

    public Person(String firstName, String lastName, String address, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
