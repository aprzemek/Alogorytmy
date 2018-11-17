package pl.sda.petle;

import java.util.Scanner;

public class ProgramDrugi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę większą od 0, alemniejsząod 100");

        int liczba = scanner.nextInt();

        while (true) {
            System.out.println(liczba);
            liczba++;
            if (liczba > 100) {
                break;
            }
        }
    }
}