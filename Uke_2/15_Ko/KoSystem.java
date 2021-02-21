import java.util.ArrayList;

class KoSystem {
    private ArrayList<KoLapp> koLapper;
    // Konstruktør
    public KoSystem(){
        koLapper = new ArrayList<KoLapp>();
    }

    public void trekkKoLapp(){
        KoLapp nyLapp = new KoLapp();
        System.out.println(nyLapp.hentKoPlass() + " er nå lagt til i køen.");
        koLapper.add(nyLapp);
    }

    public void betjenKunde(){
        System.out.println("Nummer " + koLapper.get(0).hentKoPlass() + " kan nå betjenes.");
        koLapper.remove(0);
    }

    public void printFremstIKoen(){
        System.out.println("Lappen med nummeret " + koLapper.get(0).hentKoPlass() + " er fremst i køen!");
    }

    public int antKunder(){
        int lengthOfList = koLapper.size();
        return lengthOfList;
    }

    public void printKunderIKo(){
        System.out.println("Det står " + this.antKunder() + " foran deg.");
    }
}
