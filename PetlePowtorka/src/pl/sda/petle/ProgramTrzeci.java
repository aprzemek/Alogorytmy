package pl.sda.petle;

import java.util.Scanner;

public class ProgramTrzeci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwszą liczbę");

        int liczba1 = scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("podaj drugą liczbę");

        int liczba2 = scanner.nextInt();
        int suma = liczba1 + liczba2;
        System.out.println("Wynik wynosi " + suma);
    }
}
