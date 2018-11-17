package pl.sda.wyjatki.zadanie;

import java.util.Scanner;

public class Podatek {

    // Zadanie 2:
    // Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
    // Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
    // Podatek obliczany jest wg. następujących reguł:
    // do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
    // od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wartość dochodu");

        double dochod = scanner.nextDouble();


        if (dochod<85528){

            double kasa = (dochod*0.18) - 556.02;

            System.out.println("1 grupa podatkowa: twój podatek wynosi: "+ kasa);
        }
        else
        if (dochod>85528)
        {
            double kasa2 = 14839.02+((dochod-85528)*0.32);
            System.out.println("2 grupa podatkowa: Twój podatek wynosi " + kasa2);
    }
}
}
