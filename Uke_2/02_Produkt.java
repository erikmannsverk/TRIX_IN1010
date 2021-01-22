import java.util.Scanner;

class Produkt {
    public static void main(String[] args){
        int x;
        int y;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Oppgi x-verdi: ");
        x = keyboard.nextInt();

        System.out.println("Oppgi y-verdi: ");
        y = keyboard.nextInt();

        System.out.println("Produktet av x- og y- verdien er: " + (x+y));
    }
}
