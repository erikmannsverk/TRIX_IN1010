import java.util.Scanner;


class KoProgram {
    public static void main(String[] args) {

        boolean inputGodkjent = true;

        Scanner tastatur = new Scanner(System.in);

        KoSystem sys = new KoSystem();

        while (inputGodkjent){
            System.out.println("**MENY FOR BILLETTSYSTEM** \n1 - Trekk ny kolapp.\n2 - Betjen kunde.\n3 - Print antall kunder i kø.\n4 - Print nestemann i køen.\n5 - Avslutt.\n");

            int brukerInput = tastatur.nextInt();

            if (brukerInput == 1){
                sys.trekkKoLapp();
            } else if (brukerInput == 2){
                sys.betjenKunde();
            } else if (brukerInput == 3){
                sys.printKunderIKo();
            } else if (brukerInput == 4){
                sys.printFremstIKoen();
            } else if (brukerInput == 5){
                inputGodkjent = false;
            } else {
                System.out.println("Vennligst oppgi gyldig input:)");
            }


        }
    }
}
