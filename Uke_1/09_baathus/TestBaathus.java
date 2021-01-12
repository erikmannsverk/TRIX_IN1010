class TestBaathus {
    public static void main (String[] args) {
        Baathus bh1 = new Baathus(3);
        Baat b1 = new Baat("Tesla");
        Baat b2 = new Baat("Audio");
        Baat b3 = new Baat("Mascerati");
        Baat b4 = new Baat("Lol");

        bh1.settInn(b1);
        bh1.settInn(b2);
        bh1.settInn(b3);
        bh1.settInn(b4);

        System.out.println("\nBåtinfo:");

        bh1.skrivBaater();
    }
}
