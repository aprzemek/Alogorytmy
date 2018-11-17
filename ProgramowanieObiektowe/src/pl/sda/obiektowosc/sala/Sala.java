package pl.sda.obiektowosc.sala;

public class Sala {
    String nazwa;
    Double powierzchnia;
    int iloscStanowisk;
    boolean czyJestRzutnik;
    boolean czyJestWolna = true;

    public Sala() {
    }

    public Sala(String nazwa, boolean czyJestWolna) {
        this.nazwa = nazwa;
        this.czyJestWolna = czyJestWolna;
    }

    public Sala(String nazwa, int iloscStanowisk, boolean czyJestRzutnik, boolean czyJestWolna) {
        this.nazwa = nazwa;
        this.iloscStanowisk = iloscStanowisk;
        this.czyJestRzutnik = czyJestRzutnik;
        this.czyJestWolna = czyJestWolna;
    }
}
