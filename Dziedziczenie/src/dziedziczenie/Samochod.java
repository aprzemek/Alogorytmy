package dziedziczenie;

public class Samochod {

    String kolor;
    String marka;
    int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    private int predkosc;
    private boolean czySwiatlaWlaczone;

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public boolean CzySwiatlaWlaczone() {
        return czySwiatlaWlaczone;
    }

    public void setCzySwiatlaWlaczone(boolean czySwiatlaWlaczone) {
        this.czySwiatlaWlaczone = czySwiatlaWlaczone;
    }

    public Samochod(int predkosc) {
        this.predkosc = predkosc;
        this.czySwiatlaWlaczone = false;

    }

    public void przyspiesz() {
        if (predkosc < 120) {
            System.out.println("przyśpieszam o 10km/h");
            predkosc += 10;
        } else {
            System.out.println("predkosc maksymalna została osiągnięta (120km/h)");
        }
    }

    public void wlaczSwiatla() {
        if (czySwiatlaWlaczone) {
            System.out.println("światła zostały już włączone");
        } else {
            System.out.println("Swiatła zostały włączone");
            czySwiatlaWlaczone = true;
        }

    }
}
