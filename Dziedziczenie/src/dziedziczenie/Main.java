package dziedziczenie;

public class Main {

    public static void main(String[] args) {

        Kabriolet cabrio= new Kabriolet(100);
        cabrio.schowajDach();
        cabrio.czySchowanyDach();

        Samochod audi = new Samochod(200);
        audi.getPredkosc();
        audi.wlaczSwiatla();

    }


}
