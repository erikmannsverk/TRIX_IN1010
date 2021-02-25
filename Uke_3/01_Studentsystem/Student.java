import java.util.ArrayList;

class Student{
    String navn;
    ArrayList<Fag> fagliste = new ArrayList<Fag>();

    Student(String n){
        navn = n;
    }

    public String hentNavn(){
        return navn;
    }

    // Legg til fag
    public void leggTilFag(Fag fag){
        if (fagliste.contains(fag) == false){
            //System.out.println(navn);
            fagliste.add(fag);
        }
    }
    // Fjern fag
    public void fjernFag(Fag fag){
        fagliste.remove(fag);
    }

    public int antFag(){
        return fagliste.size();
    }

    public void skrivFag(){
        for (Fag fag: fagliste){
            System.out.println(fag.hentNavn());
        }
    }
}
