package pl.sda.obiektowosc.haslo;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijHaslo {

    public static void main(String[] args) {
        System.out.println("podaj liczbę");
        Scanner scanner = new Scanner(System.in);
                int liczba = scanner.nextInt();

        Random rand = new Random();
        int wylosowana = rand.nextInt(100);
        System.out.println("wylosowana liczba wynosi: " + wylosowana);

boolean czyTrafil = false;

        while (!czyTrafil){
        if (wylosowana != liczba);
        System.out.println("Inna liczba, spróbuj jeszcze raz");
        return;




}

    }
}
