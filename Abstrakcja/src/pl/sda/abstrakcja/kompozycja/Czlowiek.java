package pl.sda.abstrakcja.kompozycja;

public class Czlowiek {


    protected final String imie;
    protected  final String nazwsiko;
    protected final int rokUrodenia;
    protected int rokZgonu;

    @Override
    public String toString() {
        return imie + " " + nazwsiko;
    }

    public Czlowiek(String imie, String nazwsiko, int rokUrodenia) {
        this.imie = imie;
        this.nazwsiko = nazwsiko;
        this.rokUrodenia = rokUrodenia;


    }
}
