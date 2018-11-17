package pl.sda.zadanie.Osoba;

public class Osoba {

    private String imie, nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception{
        sprawdzDaneOsoby(imie,nazwisko,rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    private boolean sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia)throws Exception {

        if (imie.isEmpty()){

            throw new Exception("pole imie nie może być puste");
        }

        if (nazwisko.isEmpty()){
            throw new Exception("pole nazwisko nie możeby puste");
        }

        if (rokUrodzenia<1990){
            throw new Exception("podano zły rok");
            }  else {
                    return true;
                }
                }

    @Override
    public String toString() {
        return imie+" "+ nazwisko+ " rok uodzenia: "+ rokUrodzenia;
    }
}



