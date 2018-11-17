package pl.sda.petle.petladowhile;

import java.util.Scanner;

public class LiczbyWiekszeOdZera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("podaj liczbę wieksza od 0, podaj liczbę mniejsza od 0 by zakończyć");
            liczba = scanner.nextInt();

            for (int i = 0; i<liczba; i++){

                System.out.println(i);
            }
        } while (liczba>0);


    }
}
