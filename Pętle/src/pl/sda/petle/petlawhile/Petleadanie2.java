package pl.sda.petle.petlawhile;

import java.util.Scanner;

public class Petleadanie2 {
    public static void main(String[] args) {
        int liczba, licznik, silnia;
        System.out.println("Podaj liczbę nie większą niż 12");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
        silnia = 1;
        licznik = 1;

        while(licznik <= liczba){
            silnia*= licznik;
            licznik++;

        }
        if(liczba>12){
            System.out.println("Podałeś za duża wartość");
        }else {
            System.out.println("Silnia z liczby " + liczba+ " wynosi: " + silnia);
        }

    }
}