package pl.sda.petle.petladowhile;

import java.util.Scanner;

public class DrukujHello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("podaj liczbę, wpisz 0 aby zakończyć.");
            liczba = scanner.nextInt();


            for (int i = 0; i < liczba; i++) {
                System.out.println("Hello World!");

            }
        } while (liczba != 0);
        System.out.println("Koniec");


    }
}