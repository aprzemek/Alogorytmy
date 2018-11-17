package pl.sda.abstrakcja.kompozycja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Autor jan = new Autor("Jan", "Kowalski", 1945, "Kowal", "Pozytwyizm");
        Autor mirek = new Autor("Mirek", "Nowak", 1950, "Nowy", "Brązu");
        Autor tolkien = new Autor("John", "Tolkien", 1892, "JRE", "nn");

        Ksiazka hobbit = new Ksiazka(new Autor[]{tolkien}, 350,
                "Hobbit", 1901);
        Ksiazka lotr = new Ksiazka(new Autor[]{tolkien}, 330,
                "Władca Pierścieni: Drużyna Pierścienia", 1932);
        Ksiazka lotr2 = new Ksiazka(new Autor[]{tolkien}, 330,
                "Władca Pierścieni: Dwie wieże", 1922);
        Ksiazka pol1 = new Ksiazka(new Autor[]{jan, mirek}, 22,
                "Poczytaj mi mamo", 1955);
        Czasopismo gratka1 = new Czasopismo(new Autor[]{jan}, 40,
                "Gratka", 1);

        Czasopismo gratka2 = new Czasopismo(new Autor[]{jan}, 40,
                "Gratka", 2);

        Czasopismo gratka3 = new Czasopismo(new Autor[]{jan}, 40,
                "Gratka", 3);

        Egzemplarz[] zbior = new Egzemplarz[]{hobbit, lotr, lotr2,
                pol1, gratka1, gratka2, gratka3, gratka3};

        Biblioteka biblioteka = new Biblioteka(zbior);

        System.out.println(lotr);
        System.out.println(Arrays.toString(biblioteka.szukajPotytule("dwie")));
        System.out.println(Arrays.toString(biblioteka.szukajPotytule("mamo")));
        System.out.println(Arrays.toString(biblioteka.szukajPotytule("władca")));
        System.out.println(Arrays.toString(
                biblioteka.szukajPoAutorze("Tolkien")));


    }
}
