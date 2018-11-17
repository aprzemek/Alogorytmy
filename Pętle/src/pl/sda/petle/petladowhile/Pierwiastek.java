package pl.sda.petle.petladowhile;

import java.util.Scanner;

public class Pierwiastek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba, pierwiastek = 1;
        boolean koniec = false;
        do {
            System.out.println("Wprowadź wartość aby poznać jej pierwiastek (większe od 0)");
            liczba = sc.nextInt();
            for (int i = 1; i <= liczba; i++) {
                if (i * i == liczba) {
                    System.out.println("pierwiastek liczby " + liczba + " wynosi: " + i);
                    koniec = true;
                }
            }
            if (!koniec) {
                System.out.println("liczba " + liczba + " nie posiada całkowitego pierwiastka");
            }
            koniec = false;
        } while (liczba > 0);
        System.out.println(pierwiastek);
    }
}

