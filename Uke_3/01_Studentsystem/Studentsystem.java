import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Studentsystem {
    File fil;
    ArrayList<Fag> fagliste = new ArrayList<Fag>();
    ArrayList<Student> studentliste = new ArrayList<Student>();

    Studentsystem(String filNavn){
        fil = new File(filNavn);
        this.opprett(fil);
    }

    private void opprett(File fil){
        Fag detteFaget = new Fag("Test");
        try{
            Scanner leser = new Scanner(fil);
            while (leser.hasNextLine()){
                String linje = leser.nextLine();
                String[] linjeListe = linje.split("");
                if (linjeListe[0].equals("*")){
                    detteFaget = new Fag(linje.substring(1));
                    this.leggTilFag(detteFaget);
                } else {
                    Student denneStudenten = new Student(linje);
                    denneStudenten.leggTilFag(detteFaget);
                    detteFaget.leggTilStudent(denneStudenten);
                    //System.out.println(denneStudenten.hentNavn());
                    this.leggTilStudent(denneStudenten);
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Fant ikke filen");
            e.printStackTrace();
        }
    }

    private void leggTilFag(Fag fag){
        if (fagliste.contains(fag) == false){
            fagliste.add(fag);
        }
    }

    private void leggTilStudent(Student student){
        if (studentliste.contains(student) == false){
            studentliste.add(student);
        }
    }

    // Finne ut hvilket fag som blir tatt av flest studenter.
    public void fagFlestStudenter(){
        Fag fagFlest = fagliste.get(0);
        for (Fag fag: fagliste){
            if (fag.antStudenter() > fagFlest.antStudenter()){
                fagFlest = fag;
            }
        }
        System.out.println(fagFlest.hentNavn() + " " + fagFlest.antStudenter());
    }

    // Finne ut hvilken student som tar flest fag.
    public void studentFlestFag(){
        Student studentFlest = studentliste.get(0);
        for (Student student: studentliste){
            if (student.antFag() > studentFlest.antFag()){
                studentFlest = student;
            }
        }
        System.out.println(studentFlest.hentNavn() + " " + studentFlest.antFag());
    }

    // Skrive ut alle studenter som tar et fag.
    public void skrivStudenter(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Fagnavn: ");
        String fagNavn = tastatur.nextLine();
        boolean fagFinnesIkke = true;

        for (Fag fag: fagliste){
            if (fag.hentNavn().equals(fagNavn)){
                fag.skrivStudenter();
                fagFinnesIkke = false;
            }
        }
        if (fagFinnesIkke){
            System.out.println("Faget finnes ikke.");
        }
    }

    // Skrive ut alle fag en student tar.
    public void skrivFag(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Studentnavn: ");
        String studentNavn = tastatur.nextLine();
        boolean studentFinnesIkke = true;

        for (Student student: studentliste){
            if (student.hentNavn().equals(studentNavn)){
                student.skrivFag();
                studentFinnesIkke = false;
            }
        }
        if (studentFinnesIkke){
            System.out.println("Studenten finnes ikke.");
        }
    }

    // Legge til et nytt fag til en student /legge til en ny student til et fag.
    public void leggTilFagTilStudent(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Studentnavn: ");
        String studentNavn = tastatur.nextLine();
        System.out.println("Fagnavn: ");
        String fagNavn = tastatur.nextLine();

        boolean studentFinnesIkke = true;
        boolean fagFinnesIkke = true;
        Student stu = studentliste.get(0);
        Fag fa = fagliste.get(0);

        for (Student student : studentliste){
            if (student.hentNavn().equals(studentNavn)){
                stu = student;
                studentFinnesIkke = false;
            }
        }

        for (Fag fag : fagliste){
            if (fag.hentNavn().equals(fagNavn)){
                fa = fag;
                fagFinnesIkke = false;
            }
        }

        if (studentFinnesIkke && fagFinnesIkke){
            System.out.println("Studenten og faget finnes ikke.");
        } else if (studentFinnesIkke){
            System.out.println("Studenten finnes ikke.");
        } else if (fagFinnesIkke){
            System.out.println("Faget finnes ikke.");
        } else if (studentFinnesIkke == false && fagFinnesIkke == false) {
            stu.leggTilFag(fa);
            fa.leggTilStudent(stu);
        }
    }

    // Fjerne en student fra et fag/fjerne et fag fra en student.
    public void fjernFagFraStudent(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Studentnavn: ");
        String studentNavn = tastatur.nextLine();
        System.out.println("Fagnavn: ");
        String fagNavn = tastatur.nextLine();

        boolean studentFinnesIkke = true;
        boolean fagFinnesIkke = true;
        Student stu = studentliste.get(0);
        Fag fa = fagliste.get(0);

        for (Student student : studentliste){
            if (student.hentNavn().equals(studentNavn)){
                stu = student;
                studentFinnesIkke = false;
            }
        }

        for (Fag fag : fagliste){
            if (fag.hentNavn().equals(fagNavn)){
                fa = fag;
                fagFinnesIkke = false;
            }
        }

        if (studentFinnesIkke && fagFinnesIkke){
            System.out.println("Studenten og faget finnes ikke.");
        } else if (studentFinnesIkke){
            System.out.println("Studenten finnes ikke.");
        } else if (fagFinnesIkke){
            System.out.println("Faget finnes ikke.");
        } else if (studentFinnesIkke == false && fagFinnesIkke == false) {
            stu.leggTilFag(fa);
            fa.leggTilStudent(stu);
        }

    }

    // Oppretter student
    public void opprettStudent(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Studentnavn: ");
        String studentNavn = tastatur.nextLine();

        Student nyStudent = new Student(studentNavn);
        this.leggTilStudent(nyStudent);
    }

    // Oppretter fag
    public void opprettFag(){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Fagnavn: ");
        String fagNavn = tastatur.nextLine();

        Fag nyttFag = new Fag(fagNavn);
        this.leggTilFag(nyttFag);
    }

}
