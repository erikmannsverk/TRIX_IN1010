class S {}
class G extends S {}
class B extends S {}
class Q extends B {}

class KodeanalyseTo{
    public static void main(String[] args){
        S q = new G();
        Q b = new Q();
        B s = new Q();
        B g = new B();
        S p = new B();

        System.out.println(q instanceof B); //false
        System.out.println(q instanceof G); //true
        System.out.println(q instanceof S); //true
        System.out.println(b instanceof B); //true
        System.out.println(b instanceof S); //true
        System.out.println(s instanceof B); //true
        System.out.println(g instanceof Q); //false
        System.out.println(g instanceof S); //true
        System.out.println(p instanceof S); //true
        System.out.println(p instanceof G); //false

    }
}
