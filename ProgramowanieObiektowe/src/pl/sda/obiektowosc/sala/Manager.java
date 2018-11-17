package pl.sda.obiektowosc.sala;

public class Manager {
    String imie;
    Sala[] zarzadzaneSale;

    public void WyswietlDostepnesale(){

        System.out.println("Dostępne Sale");
        for (Sala s:zarzadzaneSale)
        // for (int i=0; i<zarzadzaneSale.lenght; i++)
        {
            if (s.czyJestWolna){
                System.out.println("wolna sala: " + s.nazwa);
            }
        }
    }
public void zabookujSale(String nazwSali){
        for (Sala s: zarzadzaneSale){
            if(s.nazwa.equals(nazwSali)) {
                s.czyJestWolna = false;
                System.out.println("bookuje sale: " + nazwSali);
                s.czyJestWolna = false;
            } else {
                System.out.println("sala "  + s.nazwa + " jest już zajęta");
            }
        }
}
}
