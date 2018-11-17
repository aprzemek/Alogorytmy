package pl.sda.wyjatki.jawne;

public class Osoba {


    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodenia;



    }

    public static int obliczWiekWRoku(Osoba osoba, int rok) throws Exception {

        int wiek = rok - osoba.rokUrodzenia;
        if (wiek<0){

            throw new Exception("podano rok przed uro");

        }
        return wiek;

    }
}
