package ba.unsa.etf.rpr.tut2;
public class Program {

    public static void main(String[] args) {
            Predmet noviPredmet = new Predmet ("Razvoj programskih rjesenja" , "RPR", 60);
            Student noviStudent = new Student("Amina", "Kantic", 12345);
            System.out.println(noviStudent.dajIme() + " " + noviStudent.dajPrezime());
            noviPredmet.upis(noviStudent);
            noviPredmet.ispisStudenata();
        Predmet predmet = new Predmet("Logicki dizajn", "LD", 20);
        System.out.println(predmet.dajNaziv() + " " + predmet.dajSifru());
            // write your code here

    }
}
