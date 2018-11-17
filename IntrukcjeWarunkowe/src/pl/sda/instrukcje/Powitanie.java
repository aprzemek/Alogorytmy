package pl.sda.instrukcje;

import java.util.Scanner;

public class Powitanie {

    public static void main(String[] args) {
        System.out.println("podaj swoje imię");
        Scanner scanner = new Scanner(System.in);

        String imie = scanner.nextLine();


        switch (imie) {
            case "Ania":
                System.out.println("Cześć Ania, kopę lat!");
                break;

            case "Andrzej":
                System.out.println("hej Andrzej, gdzie są moje...");
                break;

            default:
                System.out.println("Cześć " + imie + " miło mi Cię poznać");
                break;
        }
    }
}
