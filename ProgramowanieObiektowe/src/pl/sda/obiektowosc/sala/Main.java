package pl.sda.obiektowosc.sala;

public class Main {
    public static void main(String[] args) {
        Sala geo = new Sala("Geografia", false);
        geo.nazwa = "Geografia";
        geo.czyJestRzutnik = false;

        Sala mat = new Sala();
        mat.nazwa = "Matematyka";
        mat.czyJestWolna = false;
        mat.czyJestRzutnik = true;

        Manager wozny = new Manager();
        wozny.imie = "Mietek";

        Sala[] sale = new Sala[]{geo, mat};
        wozny.zarzadzaneSale = sale;

        wozny.zabookujSale("Geografia");
        wozny.WyswietlDostepnesale();


    }
}