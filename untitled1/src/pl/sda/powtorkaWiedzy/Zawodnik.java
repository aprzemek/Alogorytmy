package pl.sda.powtorkaWiedzy;

public class Zawodnik {


    String imie;
    int identyfikator;
    int predkoscMinimalna;
    int predkoscMaksymalna;
    int pokonanaOdleglosc;


    public void przedstawSie() {

        System.out.println("Nazywam się " + imie + " mam numer " + identyfikator + ", biegam z prędkością od " + predkoscMinimalna + " do " +
                predkoscMaksymalna);
    }

    public void biegnij() {
this.pokonanaOdleglosc += predkoscMinimalna+predkoscMaksymalna/2;
        System.out.println("pokonuję odległość " + pokonanaOdleglosc);
    }

    public Zawodnik(String imie, int identyfikator, int predkoscMinimalna, int predkoscMaksymalna ) {
        this.imie = imie;
        this.identyfikator = identyfikator;
        this.predkoscMinimalna = predkoscMinimalna;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public static void main(String[] args) {
        Zawodnik pierwszy = new Zawodnik("Przemek",44,10,30);
        Zawodnik drugi = new Zawodnik("Natalia", 66,9,28);
        Zawodnik trzeci = new Zawodnik("Wojtek",5,8,40);

    Zawodnik[]zawodnicy = new Zawodnik[]{pierwszy,drugi,trzeci};

        //Osoba[] osoby = new Osoba[] {pierwsza, druga, trzecia};

        //for (Osoba o: osoby){
        pierwszy.przedstawSie();
        drugi.przedstawSie();
        trzeci.przedstawSie();
for (;;) {
        for (Zawodnik z:zawodnicy){
            z.biegnij();
            if(z.pokonanaOdleglosc>50){
                System.out.println("wygrałem");
                return;
            }
        }

}

    }


}


