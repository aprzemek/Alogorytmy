package pl.sda.wyjatki.jawne;

public class Main {


    public static void main(String[] args) {
        Osoba andrzej = new Osoba("Andrzej", 9);

        try {
            System.out.println(Osoba.obliczWiekWRoku(andrzej, 2000));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("koniec");
        }
    }
}