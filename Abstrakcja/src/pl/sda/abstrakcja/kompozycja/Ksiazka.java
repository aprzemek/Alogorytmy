package pl.sda.abstrakcja.kompozycja;

public class Ksiazka extends Egzemplarz{

    private String tytul;
    private int rokWydania;

    @Override
    public String toString() {
        return tytul + " " + super.toString();
    }

    @Override
    public String pobierzTytul() {
        return tytul;
    }

    public Ksiazka(Autor[] autorzy, int liczbaStron, String tytul, int rokWydania) {
        super(autorzy, liczbaStron);
        this.tytul = tytul;
        this.rokWydania = rokWydania;



    }
}
