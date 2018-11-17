package pl.sda.petle.petlafor;

import java.util.Scanner;

public class DrukujLiczby {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");

        int liczba = scanner.nextInt();

        for (int i = 0; i <= liczba; i++) {
            System.out.println(i);
        }
    }
}
