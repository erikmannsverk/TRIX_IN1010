class Hovedprogram {
    public static void main (String[] args) {
        Rektangel rek1 = new Rektangel(10, 5);
        Rektangel rek2 = new Rektangel(2, 4);


        System.out.println(rek1.areal());
        System.out.println(rek2.areal());

        rek1.oekLengde(10);
        rek2.oekBredde(3);

        System.out.println(rek1.omkrets());
        System.out.println(rek2.omkrets());

        rek1.redLengde(19);

        System.out.println(rek1.areal());
    }
}
