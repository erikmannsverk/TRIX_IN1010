import java.util.Scanner;

class Handletur{
    public static void main(String[] args){
        Scanner tastatur = new Scanner(System.in);
        int sum = 0;

        System.out.println("Hei! Velkommen til IFI-butikken.");

        System.out.println("Hvor mange brød vil du ha?");
        int antallBroed = tastatur.nextInt();
        sum += (antallBroed * 10);

        System.out.println("Hvor mange melk vil du ha?");
        int antallMelk = tastatur.nextInt();
        sum += (antallMelk * 15);

        System.out.println("Hvor mange ost vil du ha?");
        int antallOst = tastatur.nextInt();
        sum += (antallOst * 40);

        System.out.println("Hvor mange youghurt vil du ha?");
        int antallYg = tastatur.nextInt();
        sum += (antallYg * 12);
        
        System.out.println("Du skal betale: " + sum + " kr.");
    }
}
