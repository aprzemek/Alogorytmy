package pl.sda.zadanie.Osoba;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Osoba o = null; //zainicjowanie osoby i przypisanie jej wartości null po to aby można wywować po pętli toString
        boolean czyDodana = false;

        while (!czyDodana) {
            System.out.println("podaj imie:");
            String imie = sc.nextLine();
            System.out.println("podaj nazwisko:");
            String nazwisko = sc.nextLine();
            System.out.println("podaj rok urodzenia");
            int rokUrodzenia =0;
            //blok w którym sprawdzamy czy wprowadzona wartośc jest liczbą, jeżeli nie to wyrzuca nam wyjątek i komunikat jaki zapisaliśmy
            try {
                rokUrodzenia = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("nie podałeś liczby");
            }
            //blok w którym jest próba utworzonia obiektu osoby, na początku zostaje wykonana metoda w konstruktorze która sprawdza
            // czy wprowadzone danę są poprawne, jeżeli nie są to zostaje przechwycony wyjątek z odpowiednim komunikatem
            try {
                o = new Osoba(imie, nazwisko, rokUrodzenia);
                czyDodana = true;
            }  catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(o.toString());
    }
}