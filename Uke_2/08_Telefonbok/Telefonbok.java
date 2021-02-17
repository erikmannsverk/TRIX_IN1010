import java.util.ArrayList;

class Telefonbok {
    public static void main(String[] args){
        Person p1 = new Person("Nils", "91230219", "Humleveien 9");
        Person p2 = new Person("Hans", "10320132", "Bøsjveien 23");
        Person p3 = new Person("Geir", "34932042", "Livei 91");

        //final int LENGTH = 10;
        //Person[] personListe = new Person[LENGTH]; //Oppgave b

        ArrayList<Person> personListe = new ArrayList<Person>(); //Oppgave c
        personListe.add(p1);
        personListe.add(p2);
        personListe.add(p3);

        for (Person element : personListe){
            element.skrivInfo();
        }
    }
}
