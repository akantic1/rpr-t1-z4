package ba.unsa.etf.rpr.tut2;
import java.util.*;
public class Predmet {
    static String nazivPredmeta,sifraPredmeta;
    static int maxBrojStudenata;
    private int brojStudenata;
    static private Student[] nizStudenata;

    public Predmet(String nazivNovogPredmeta, String sifraNovogPredmeta, int maxBrStudenata){
        kreiraj(nazivNovogPredmeta, sifraNovogPredmeta, maxBrStudenata);
        nizStudenata = new Student[maxBrStudenata] ;
    }
    void kreiraj(String nazivNovogPredmeta, String sifraNovogPredmeta, int maxBrStudenata){
        nazivPredmeta = nazivNovogPredmeta;
        sifraPredmeta = sifraNovogPredmeta;
        maxBrojStudenata = maxBrStudenata;
    }

    String dajSifru(){
        return sifraPredmeta;
    }
    String dajNaziv(){
        return nazivPredmeta;
    }
    int dajMaxBrojStudenata(){
        return maxBrojStudenata;
    }
    void promijeniNazivPredmeta(Predmet noviPredmet){
        this.nazivPredmeta = noviPredmet.dajNaziv();
    }
    void promijeniSifruPredmeta(Predmet noviPredmet){
        this.sifraPredmeta = noviPredmet.dajSifru();
    }
    void obrisiPredmet(){
        nazivPredmeta = "";
        sifraPredmeta = "";
        maxBrojStudenata = 0;
    }
    void upis(Student noviStudent){
        if(brojStudenata == maxBrojStudenata)
            System.out.println("Kapacitet niza popunjen");
        else {
            nizStudenata[brojStudenata] = noviStudent;
            brojStudenata++;
        }
    }
    void ispisi(Student ispisiStudenta){
        for(int i= 0 ; i < brojStudenata ; i++){
            if(nizStudenata[i].dajIme() == ispisiStudenta.dajIme() && nizStudenata[i].dajPrezime() == ispisiStudenta.dajPrezime()
                    && nizStudenata[i].dajBrojIndexa() == ispisiStudenta.dajBrojIndexa())
                for(int j = i ; j < brojStudenata ; j++)
                    nizStudenata[i] = nizStudenata[i+1];
            brojStudenata--;
        }

    }
    void ispisStudenata(){
        for(int i= 0 ; i < brojStudenata ; i++){
            System.out.println(i+1 + ".");
            nizStudenata[i].ispisiStudenta(nizStudenata[i]);
        }
    }
}
