import java.util.ArrayList;

class Fag {
    String navn;
    ArrayList<Student> studentliste = new ArrayList<Student>();

    Fag(String n){
        navn = n;
    }

    public String hentNavn(){
        return navn;
    }

    // Legg til student
    public void leggTilStudent(Student student){
        if (studentliste.contains(student) == false){
            //System.out.println(navn);
            studentliste.add(student);
        }
    }

    // Fjern student
    public void fjernStudent(Student student){
        studentliste.remove(student);
    }

    public int antStudenter(){
        return studentliste.size();
    }

    public void skrivStudenter(){
        for (Student student: studentliste){
            System.out.println(student.hentNavn());
        }
    }
}
