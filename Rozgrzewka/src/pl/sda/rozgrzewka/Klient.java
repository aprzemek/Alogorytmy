package pl.sda.rozgrzewka;

public class Klient {

    private Koszyk mojKoszyk;
    private String imie;
    private double srodki;

    public Klient(String imie, double srodki) {
        this.imie = imie;
        this.srodki = srodki;
        this.mojKoszyk = new Koszyk();
    }

    public void setMojKoszyk(Koszyk mojKoszyk) {
        this.mojKoszyk = mojKoszyk;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setSrodki(double srodki) {
        this.srodki = srodki;
    }

    public Koszyk getMojKoszyk() {

        return mojKoszyk;
    }

    public String getImie() {
        return imie;
    }

    public double getSrodki() {
        return srodki;
    }

    public void zaplacZaKoszyk(){

        double koszt = mojKoszyk.przeliczWartosc();
        if(koszt>srodki) {
            System.out.println("jesteś biedny");
        } else {

            srodki = srodki - koszt;
            System.out.println("pozostałe środki: " + srodki);
        }

        mojKoszyk.zeruj();

        }
    }



