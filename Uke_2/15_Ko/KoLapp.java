class KoLapp{
    public static int nr = 1;
    private int koPlass;

    //Konstruktør
    public KoLapp(){
        koPlass = nr;
        nr ++;
    }

    public int hentKoPlass(){
        return koPlass;
    }
}
