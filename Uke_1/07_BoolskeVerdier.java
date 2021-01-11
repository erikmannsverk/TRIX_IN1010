class Boolsk {
    public static void main (String[] args) {
        boolean sann = true;
        boolean usann = false;

        System.out.println(sann);

        if (sann != usann) {
            System.out.println("Første test slo ann!");
        }

        if (sann == usann) {
            System.out.println("Andre test slo ann!");
        } else {
            System.out.println("Andre test slo ikke ann!");
        }
    }
}
