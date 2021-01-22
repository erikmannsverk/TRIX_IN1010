import java.util.HashMap;
import java.util.Scanner;


class Telefonbok {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String brukerInput;

        HashMap<String, String> telefonbok = new HashMap<String, String>();
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        boolean inputGodkjent = true;
        String utgang = "A";

        while (inputGodkjent) {
            System.out.println(" "); // Luft i terminalen
            System.out.println("Navn: ('a' for å avslutte)");
            brukerInput = keyboard.next();
            String capBruker = brukerInput.substring(0, 1).toUpperCase() + brukerInput.substring(1);

            if (capBruker.equals(utgang)){
                System.out.println(telefonbok); //eksempel på printing av hashmap
                telefonbok.forEach((key, value) -> System.out.println(key + " : " + value)); //eksempel 2
                System.out.println(telefonbok.keySet()); //printer nøklene
                inputGodkjent = false;
            } else if (telefonbok.containsKey(capBruker)) {
                System.out.println(telefonbok.get(capBruker));
            }

        }
    }
}
