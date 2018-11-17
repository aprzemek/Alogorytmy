package dziedziczenie;

public class Kabriolet extends Samochod {
    private boolean schowanyDach;

    public boolean czySchowanyDach() {
        return schowanyDach;
    }
    public Kabriolet(int predkosc) {
        super(predkosc);
        this.schowanyDach = false;

    }
    public Kabriolet(String kolor, String marka, int rocznik, boolean schowanyDach) {
        super(kolor, marka, rocznik);
        this.schowanyDach = schowanyDach;
    }

    public void schowajDach() {
        if (schowanyDach) {
            System.out.println("dach już jest schowany");
        } else {
            schowanyDach = true;
        }
    }

    @Override
    public void przyspiesz() {
        super.przyspiesz();

        if (super.getPredkosc()<180){
            System.out.println("przyspieszam o 10 km/h");
            super.setPredkosc(getPredkosc());
        }
    }
}
