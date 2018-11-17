package pl.sda.petle.petlafor.d;

import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczba");

        int liczba = scanner.nextInt();

        System.out.println("Podaj dzielnik");
        int dzielnik = scanner.nextInt();
        for (int i = 0; i <= liczba; i++) {
            if (i % dzielnik == 0) {
                System.out.println(i);

            }


        }
    }
}
