package pl.sda.rozgrzewka;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    private List<Produkt> produkty;


    public Koszyk() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produktDoDodania) {

        System.out.println("dodajemy: " + produktDoDodania.getNazwa());

        produkty.add(produktDoDodania);

    }

    public double przeliczWartosc() {
        double suma = 0;
        for (Produkt p : produkty) {
            suma += p.getCena();
            //suma = suma + p.getCena();

        }
        return suma;
    }

    //double wynik = przeliczWartosc();

    public void zeruj() {
        this.produkty.clear();
    }
}