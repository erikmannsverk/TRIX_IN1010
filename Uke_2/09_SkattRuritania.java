import java.util.Scanner;

class SkattRuritania {
    public static void main (String[] args) {
        int skatt = 0;
        int inntekt = Integer.parseInt(args[0]); //Skriv inntekt etter 'java SkattRuritania' i terminalen
        if (inntekt < 10000){
            System.out.println(inntekt*0.1);
        } else {
            System.out.println(1000+((inntekt-10000)*0.3));
        }
    }
}
