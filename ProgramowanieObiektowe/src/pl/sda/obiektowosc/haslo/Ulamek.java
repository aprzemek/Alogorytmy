package pl.sda.obiektowosc.haslo;

public class Ulamek {
    int licznik;
    int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    public void wyswietlanieUlamka () {
        System.out.println("Wprowadzony ułamek to: " +licznik + "/" +mianownik);
    }
    public void dodawanieUlamkow(Ulamek ulamek) {
        int sumaLicznik;
        int sumaMianownik;
        sumaLicznik = (this.licznik * ulamek.mianownik) + (ulamek.licznik * this.mianownik);
        sumaMianownik = (this.mianownik * ulamek.mianownik);
        System.out.println("Wynik dodawania " +this.licznik+ "/" +this.mianownik +" i " +
                ulamek.licznik +"/" +ulamek.mianownik +" wynosi: " +sumaLicznik +"/" +sumaMianownik);
    }
    public void odejmowanieUlamkow(Ulamek ulamek) {
        int roznicaLicznik;
        int roznicaMianownik;
        roznicaLicznik = (this.licznik * ulamek.mianownik) - (ulamek.licznik * this.mianownik);
        roznicaMianownik = (this.mianownik * ulamek.mianownik);
        System.out.println("Wynik odejmowania " +this.licznik+ "/" +this.mianownik +" i " +
                ulamek.licznik +"/" +ulamek.mianownik +" wynosi: " +roznicaLicznik +"/" +roznicaMianownik);
    }
    public void mnozenieUlamkow(Ulamek ulamek) {
        int iloczynLicznik;
        int iloczynMianownik;
        iloczynLicznik = (this.licznik * ulamek.licznik);
        iloczynMianownik = (this.mianownik * ulamek.mianownik);
        System.out.println("Wynik mnożenia " +this.licznik+ "/" +this.mianownik +" i " +
                ulamek.licznik +"/" +ulamek.mianownik +" wynosi: " +iloczynLicznik +"/" +iloczynMianownik);
    }
    public void dzielenieUlamkow(Ulamek ulamek) {
        int ilorazLicznik;
        int ilorazMianownik;
        ilorazLicznik = (this.licznik * ulamek.mianownik);
        ilorazMianownik = (this.mianownik * ulamek.licznik);
        System.out.println("Wynik dzielenia " +this.licznik+ "/" +this.mianownik +" i " +
                ulamek.licznik +"/" +ulamek.mianownik +" wynosi: " +ilorazLicznik +"/" +ilorazMianownik);
    }
    public static void main(String[] args) {

        Ulamek ulamek1 = new Ulamek(3,5);
        Ulamek ulamek2 = new Ulamek(7,8);

        ulamek1.wyswietlanieUlamka();
        ulamek1.dodawanieUlamkow(ulamek2);
        ulamek2.odejmowanieUlamkow(ulamek1);
        ulamek1.mnozenieUlamkow(ulamek2);
        ulamek1.dzielenieUlamkow(ulamek2);
    }
}
