package pl.sda.abstrakcja.kompozycja;

import java.util.Arrays;

public abstract class Egzemplarz {

    private  final Autor[] autorzy;

    private final int liczbaStron;

    @Override
    public String toString() {
        return "autorstwa" + Arrays.toString(autorzy);
    }

    public Egzemplarz(Autor[] autorzy, int liczbaStron) {
        this.autorzy = autorzy;
        this.liczbaStron = liczbaStron;

    }

    public abstract String pobierzTytul();

    public Autor[] pobierzAutorow(){
        return autorzy;
    }

}
