package ba.unsa.etf.rpr.tut2;
import java.util.*;
public class Student {
    static String imeStudenta, prezimeStudenta;
    static int brojIndexa;



    public Student (String ime, String prezime, int Index) {
        kreiraj(ime, prezime , Index);
    }
    void kreiraj(String ime, String prezime, int Index){
        imeStudenta = ime;
        prezimeStudenta = prezime;
        brojIndexa = Index;
    }
    String dajIme() {
        return imeStudenta;
    }
    String dajPrezime() {
        return prezimeStudenta;
    }
    int dajBrojIndexa() {
        return brojIndexa;
    }
    void promijeniIme(Student noviStudent){
        this.imeStudenta = noviStudent.dajIme();
    }
    void promijeniPrezime(Student noviStudent){
        this.prezimeStudenta = noviStudent.dajPrezime();
    }
    void promijeniIndex(Student noviStudent){
        this.brojIndexa = noviStudent.dajBrojIndexa();
    }
    void obrisiStudenta(){
        imeStudenta = "";
        prezimeStudenta = "";
        brojIndexa = 0;
    }

    void ispisiStudenta(Student student){
        System.out.println(student.dajPrezime() + " " + student.dajIme() + " (" + student.dajBrojIndexa() + ")");
    }
}
