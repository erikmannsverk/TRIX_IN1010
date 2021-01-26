class Student {
    private String navn;
    private int totalScore;
    private int antallQuiz;

    public Student(String n, int total, int ant){
        navn = n;
        totalScore = total;
        antallQuiz = ant;
    }

    public void leggTilQuizScore(int score){
        totalScore += score;
        antallQuiz ++;
    }

    public int hentTotalScore(){
        return totalScore;
    }

    public String hentNavn(){
        return navn;
    }

    public int hentGjennomsnittligScore(){
        return (totalScore/antallQuiz);
    }
}
