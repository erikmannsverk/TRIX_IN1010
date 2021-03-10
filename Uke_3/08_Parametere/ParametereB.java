public class ParametereB {
    public static void main(String[] args) {
        int b = 5;

        metodeTo(b);

        System.out.println(b);

    }

    public static int metodeTo(int b) {
        b = b + 2;
        return b;
    }
}
