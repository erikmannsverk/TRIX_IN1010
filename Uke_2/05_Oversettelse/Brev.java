import java.util.ArrayList;

class Brev {
    private String avsender;
    private String mottaker;
    private ArrayList<String> linjer;

    public Brev(String a, String m){
        avsender = a;
        mottaker = m;
        linjer = new ArrayList<String>();
    }

    public void skrivLinje(String l){
        linjer.add(l);
    }

    public void lesBrev(){
        System.out.println("----------------"); // Luft i terminalen
        System.out.println("Til: " + mottaker);
        for(int i = 0; i < linjer.size(); i++){
            System.out.println(linjer.get(i));
        }
        System.out.println(" "); // Luft i terminalen
        System.out.println("Med vennlig hilsen: " + avsender);
        System.out.println("----------------"); // Luft i terminalen
    }
}
