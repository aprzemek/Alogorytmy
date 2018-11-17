package pl.sda.abstrakcja.kompozycja;

public class Biblioteka {

    private Egzemplarz[] zbior;


    public Biblioteka(Egzemplarz[] zbior) {
        this.zbior = zbior;


    }

    public Egzemplarz[] szukajPotytule(String tytul) {
        Egzemplarz[] znalezione = new Egzemplarz[zbior.length];
        int i = 0;
        tytul = tytul.toLowerCase();
        for (Egzemplarz egzemplarz : zbior) {
            if (egzemplarz.pobierzTytul().toLowerCase().contains(tytul)) {
                znalezione[i] = egzemplarz;
                i++;
            }
        }
        return znalezione;
    }

    public Egzemplarz[] szukajPoAutorze(String szukanyautor) {
        Egzemplarz[] pasujace = new Egzemplarz[zbior.length];
        int i = 0;
        for (Egzemplarz egzemplarz : zbior) {
            for (Autor autor : egzemplarz.pobierzAutorow()) {

                if (autor.toString().toLowerCase().contains(szukanyautor)) {
                    pasujace[i] = egzemplarz;
                    i++;
                    break;
                }
            }
        }
        return przytnij(pasujace);
    }

    private Egzemplarz[] przytnij(Egzemplarz[] egzemplarze) {
        int wielkoscNowejTablicy = 0;
        for (Egzemplarz egzemplarz : egzemplarze) {
            if (egzemplarz == null) {

                break;
            }

            wielkoscNowejTablicy++;
        }
        Egzemplarz[] przycieta = new Egzemplarz[wielkoscNowejTablicy];
        for (int i=0; i<przycieta.length; i++){
            przycieta[i] = egzemplarze[i];
        }
        return przycieta;
    }
}



