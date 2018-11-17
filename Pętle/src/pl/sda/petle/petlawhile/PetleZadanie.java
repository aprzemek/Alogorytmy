package pl.sda.petle.petlawhile;

import java.util.Scanner;

public class PetleZadanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba = scanner.nextInt();
        int licznik = 1;
        int suma = 0;

        while (licznik <= liczba) {



            suma += licznik;
            licznik++;

        }System.out.println(suma);
    }

}