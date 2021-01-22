import java.util.Scanner;

class MindreStorre {
    public static void main(String[] args) {

        int brukerInput;

        Scanner keyboard = new Scanner(System.in);

        boolean inputGodkjent = true;
        while (inputGodkjent) {
            System.out.println(" "); // Luft i terminalen

            System.out.println("Skriv et tall (0 for å avslutte): ");
            brukerInput = keyboard.nextInt(); // Ber om input fra bruker

            if (brukerInput == 0){
                inputGodkjent = false;
            } else if (brukerInput < 10){
                System.out.println("Tallet er mindre enn 10.");
            } else if (brukerInput >= 10 && brukerInput <= 20){
                System.out.println("Tallet er mellom 10 og 20.");
            } else if (brukerInput > 20){
                System.out.println("Tallet er større enn 20.");
            }

            System.out.println(" "); // Luft i terminalen

        }
    }
}
