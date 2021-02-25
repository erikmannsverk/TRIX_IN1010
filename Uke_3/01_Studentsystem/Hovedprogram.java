import java.util.Scanner;

class Hovedprogram{
    public static void main(String[] args){

        Studentsystem ss = new Studentsystem("emnestudenter.txt");

        Scanner tastatur = new Scanner(System.in);
        boolean inputGodkjent = true;

        while (inputGodkjent){

            System.out.println("1: Fag med flest studenter \n2: Student med flest fag \n3: Skriv ut alle studenter som tar et fag\n4: Skriv ut alle fag en student tar\n5: Legge til et nytt fag til en student/ ny student til et fag\n6: Fjerne en student fra et fag/fjerne et fag fra en student\n7: Opprett student\n8: Opprett fag\n9: Avslutt");

            int brukerInput = tastatur.nextInt();

            if (brukerInput == 1){
                ss.fagFlestStudenter();
            } else if (brukerInput == 2){
                ss.studentFlestFag();
            } else if (brukerInput == 3){
                ss.skrivStudenter();
            } else if (brukerInput == 4){
                ss.skrivFag();
            } else if (brukerInput == 5){
                
            } else if (brukerInput == 6){

            } else if (brukerInput == 7){

            } else if (brukerInput == 8){

            } else if (brukerInput == 9){
                System.out.println("Avslutter ...");
                inputGodkjent = false;
            } else {
                System.out.println("Beklager, input ikke godkjent.");
            }
        }
    }
}
