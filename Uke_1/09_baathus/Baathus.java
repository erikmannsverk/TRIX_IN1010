class Baathus {

    private int antallPlasser;
    private Baat[] arrBaater;

    public Baathus(int plasser){
        antallPlasser = plasser;
        arrBaater = new Baat[antallPlasser];
    }

    public void settInn(Baat baatObj){

        if (arrBaater[antallPlasser-1] != null){
            System.out.println("Det er desverre ikke flere plasser.");
        }

        for(int i = 0; i < antallPlasser; i++){
            if (arrBaater[i] == null) {
                arrBaater[i] = baatObj;
                System.out.println("Baaten har lagt til i plass: " + i);
                break;
            }
        }
    }

    public void skrivBaater(){

        for(int i = 0; i < antallPlasser; i++) {
            if (arrBaathus[i] != null) {
                System.out.println(arrBaater[i].hentInfo());
            }
        }
    }
}
