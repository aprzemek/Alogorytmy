package pl.sda.rozgrzewka;

public class Main {
    public static void main(String[] args) {

        Produkt monitor = new Produkt("LCD",699);
        Produkt laptop = new Produkt("Laptop", 2999);

        Klient janusz = new Klient("Janusz",1000);
        Klient bogacz = new Klient("Alojzy",5000);


        janusz.getMojKoszyk().dodajProdukt(laptop);
        bogacz.getMojKoszyk().dodajProdukt(monitor);
        bogacz.getMojKoszyk().dodajProdukt(laptop);

        janusz.zaplacZaKoszyk();
        System.out.println(janusz.getImie() + " pozostale środki " + janusz.getSrodki());

        bogacz.zaplacZaKoszyk();
        System.out.println(bogacz.getImie() + " pozostale środki " + bogacz.getSrodki());
    }
}
