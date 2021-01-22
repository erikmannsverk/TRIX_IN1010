import java.util.Scanner;

class Differanse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oppgi verdien til x: ");
        int tall1 = scanner.nextInt();
        System.out.println("Oppgi verdien til y: ");
        int tall2 = scanner.nextInt();
        System.out.println("Differansen mellom x og y: ");
        System.out.println(tall1 - tall2);

    }
}
