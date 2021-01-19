class Biltest {
    public static void main(String[] args){
        Bil bil1 = new Bil("Erik", "Tesla");
        Bil bil2 = new Bil("Geir Ove", "Saab");

        System.out.println(bil1.skrivEier());
        System.out.println(bil1.skrivMerke());
        System.out.println(bil2.skrivEier());
        System.out.println(bil2.skrivMerke());
    }
}
