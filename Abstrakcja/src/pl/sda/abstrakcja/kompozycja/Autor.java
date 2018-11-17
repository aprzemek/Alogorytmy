package pl.sda.abstrakcja.kompozycja;

public class Autor  extends Czlowiek{

    private final String pseudonim;
    private final String epoka;

    public Autor(String imie, String nazwsiko, int rokUrodenia, String pseudonim, String epoka) {
        super(imie, nazwsiko, rokUrodenia);
        this.pseudonim = pseudonim;
        this.epoka = epoka;
    }
}

