package osoba;

public class Osoba {

     String imie;
     String nazwisko;
     int wiek;


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void przedstawSie(){
        System.out.println("cześć nazywam się: " + imie+ " "+ nazwisko+ " i mam " + wiek+" lat");



    }
}
