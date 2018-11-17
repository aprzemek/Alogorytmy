package pl.sda.obiektowosc;

public class Osoba {
    String imie;
    int wiek;
    String plec;


    private void przedstawSie() {

        System.out.println("cześć, mam na imie " + imie + " i mam " + wiek + " lat");

    }




    public Osoba(String imie, int wiek, String plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;



    }



    public static void main(String[] args) {
        Osoba pierwsza = new Osoba("Ania ", 25, "kobieta");
        pierwsza.przedstawSie();

        Osoba druga = new Osoba("Andrzej ", 54, "facet");
        druga.przedstawSie();

        Osoba trzecia = new Osoba("Mariola ", 18, "kobieta");
        trzecia.przedstawSie();

        Osoba[] osoby = new Osoba[] {pierwsza, druga, trzecia};

        for (Osoba o: osoby){

        System.out.println(o.imie + " ma " + o.wiek +" i jest "+ o.plec);

        }
    }
}
