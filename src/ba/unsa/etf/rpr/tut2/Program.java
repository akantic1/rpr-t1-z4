package ba.unsa.etf.rpr.tut2;
public class Program {

    public static void main(String[] args) {
            Predmet noviPredmet = new Predmet ("Razvoj programskih rjesenja" , "RPR", 60);
            Student noviStudent = new Student("Amina", "Kantic", 12345);

            noviPredmet.upis(noviStudent);
            noviPredmet.ispisStudenata();
            // write your code here

    }
}
