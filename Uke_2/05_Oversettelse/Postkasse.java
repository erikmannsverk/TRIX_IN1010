import java.util.Arrays;

class Postkasse {
    private Brev[] brev = {};

    public void leggTilBrev(Brev b){
        brev = Arrays.copyOf(brev, brev.length + 1);
        brev[brev.length - 1] = b;
    }

    public void skrivBrev(){
        for(int i = 0; i < brev.length; i++){
            System.out.println("Brev " + i + ":");
            brev[i].lesBrev();
        }
    }

}
