package pl.sda.abstrakcja.kompozycja;

public class Czasopismo extends Egzemplarz {
    protected String nazwa;
    protected int numer;

    public Czasopismo(Autor[] autorzy, int liczbaStron, String nazwa, int numer) {
        super(autorzy, liczbaStron);
        this.nazwa = nazwa;
        this.numer = numer;



    }

    @Override
    public String pobierzTytul() {
        return nazwa;
    }
}
