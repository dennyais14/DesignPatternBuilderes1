//Crea una classe Person con i campi firstName, lastName,
// age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore
// e dei metodi specifici (tranne nome e cognome, gli altri campi
// sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder1 = new PersonBuilder();
        builder1.setFirstName("Giovanni");
        builder1.setLasttName("Rossi");
        Person person1 = builder1.build();
        System.out.println("Persona 1: "+ person1);

        PersonBuilder builder2 = new PersonBuilder();
        builder2.setFirstName("Ilaria");
        builder2.setLasttName("Bianchi");
        Person person2 = builder2.build();
        System.out.println("Persona 2: "+ person2);
    }
}