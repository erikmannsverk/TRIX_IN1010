class HeltallsArray {
    public static void main(String[] args){
        int noll, en, to, tre, fire;
        noll = 0;
        en = 1;
        to = 2;
        tre = 3;
        fire = 4;

        System.out.println(noll);
        System.out.println(en);
        System.out.println(to);
        System.out.println(tre);
        System.out.println(fire);

        System.out.println("Neste: ");

        int[] heltallsArray = new int[5];
        for (int i = 0; i < heltallsArray.length; i++){
            heltallsArray[i] = i;
        }

        for (int elem : heltallsArray){
            System.out.println(elem);
        }
    }
}
