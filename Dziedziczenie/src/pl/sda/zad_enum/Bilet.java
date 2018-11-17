package pl.sda.zad_enum;

public enum Bilet {

    ULGOWY_CALODNIOWY(1440, 10),
    ULGOWY_GODZINNY(60, 3.8),
    NORMALNY_GODZINNY(60, 7.6),
    NORMALNY_CALODNIOWY(1440, 20),
    BRAK_BILETU(0, 0);

    Bilet(int czasJazdy, double cena) {
        this.czasJazdy = czasJazdy;
        this.cena = cena;
    }
    int czasJazdy;
    private double cena;

    public double getCena() {
        return cena;
    }

    public int getCzasJazdy() {
        return czasJazdy;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println(this.name()+ getCena()+ getCzasJazdy());
    }


}
