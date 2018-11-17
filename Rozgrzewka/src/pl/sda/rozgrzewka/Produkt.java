package pl.sda.rozgrzewka;

public class Produkt {

    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void wyswietlOpis(){

        System.out.println(nazwa+ " w świetnej cenie, za jedyne: "+ cena +"!!!");
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}
