

class Bygning{
    double bruttoAreal;
    Bygning(double ba){
        bruttoAreal = ba;
        System.out.println("Bygning");
    }
}

class Skyskraper extends Bygning{
    int antEtasjer;

    Skyskraper(double ba, int ae){
        super(ba);
        antEtasjer = ae;
        System.out.println("Skyskraper");
    }
}

class Bygg {
    public static void main(String[] args){
        Bygning s1 = (Skyskraper) new Skyskraper(1300, 3);
    }
}
