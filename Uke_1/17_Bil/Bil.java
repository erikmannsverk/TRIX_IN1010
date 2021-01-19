class Bil {
    private String eier;
    private String merke;

    public Bil(String e, String m) {
        eier = e;
        merke = m;
    }

    public String skrivEier() {
        return eier;
    }

    public String skrivMerke() {
        return merke;
    }
}
