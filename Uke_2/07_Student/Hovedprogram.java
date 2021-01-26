class Hovedprogram {
    public static void main(String[] args){
        Student s1 = new Student("Joakim", 0, 0);
        Student s2 = new Student("Kristin", 0, 0);
        Student s3 = new Student("Dag", 0, 0);

        s1.leggTilQuizScore(10);
        s2.leggTilQuizScore(30);
        s3.leggTilQuizScore(40);

        s1.leggTilQuizScore(5);
        s2.leggTilQuizScore(20);
        s3.leggTilQuizScore(10);

        System.out.println("Joakim: " + s1.hentGjennomsnittligScore());
        System.out.println("Kristin: " + s2.hentGjennomsnittligScore());
        System.out.println("Dag: " + s3.hentGjennomsnittligScore());
    }
}
