import java.util.Scanner;

class Hovedprogram{
    public static void main(String[] args) {
        boolean inputGodkjent = true;
        String brukerInput;
        Scanner keyboard = new Scanner(System.in);
        Postkasse pk = new Postkasse();
        Brev startbrev = new Brev("Charlie", "Julenissen");
        startbrev.skrivLinje("Hei, jeg ønsker meg en bil.");
        pk.leggTilBrev(startbrev);

        while (inputGodkjent) {
            System.out.println("\ns: Skriv brev \nl: Les brev \na: avslutt \n");
            brukerInput = keyboard.next();

            if (brukerInput.equals("s")){ // Skriv nytt brev

                boolean skriver = true;
                String avsender, mottaker, linje;

                System.out.println("Avsender: ");
                avsender = keyboard.next();
                System.out.println("Mottaker: ");
                mottaker = keyboard.next();
                Brev brev = new Brev(avsender, mottaker);
                System.out.println("\nSkriv 'a' når du er ferdig!");
                while (skriver) {
                    linje = keyboard.nextLine();
                    if (linje.equals("a") == false){
                        brev.skrivLinje(linje);
                    } else {
                        pk.leggTilBrev(brev);
                        skriver = false;
                    }
                }
            } else if (brukerInput.equals("l")){ // Les alle brevene i postkassen
                pk.skrivBrev();
            } else if (brukerInput.equals("a")){
                inputGodkjent = false;
            }
        }
    }
}
