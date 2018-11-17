package pl.sda.obiektowosc.haslo;

import java.util.Random;
import java.util.Scanner;

public class Haslo {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int min, max;
        System.out.println("Wproawdź dolny zakres: ");
        min = sc.nextInt();
        System.out.println("wprowadź dolny zakres: ");
        max = sc.nextInt();

        System.out.println("Komputer wygenerował liczbę z przedziału " + min + " - " + max + ", zgadnij ją masz 5 prób!");

        int losowa = random.nextInt(max - min + 1) + min, uzytkownika, bledy = 5;
        boolean czyZgadl = false;

        while (!czyZgadl) {
            uzytkownika = sc.nextInt();
            if (uzytkownika != losowa) {
                bledy--;
                if (bledy == 0) {
                    System.out.println("wyczerpałeś ilość prób");
                    return;
                }
                if (uzytkownika > losowa) {
                    System.out.println("liczba losowa jest mniejsza");
                } else {
                    System.out.println("liczba jest większa");
                }
                System.out.println("Nie trafiłeś, zostało ci " + bledy + " prób");
            } else {
                System.out.println("gratulacje trafiłeś!");
                czyZgadl = true;
            }
        }
    }
}