package pl.sda.wyjatki.zadanie;

import java.util.Random;
import java.util.Scanner;

public class Zad1d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dolny zakres");

        int dolny = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj górny zakres");

        int gorny = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("ile razy");

        int mnoznik = scanner2.nextInt();

        Random losowaniezakresu = new Random();
        Random r=new Random();
        int[] wyniki=new int[mnoznik];
        for(int i=dolny;i<=gorny;i++)
        {
            int l=r.nextInt(mnoznik)+1;
            wyniki[l-1]++;
        }
        for(int i=0;i<wyniki.length;i++)
        {
            System.out.println(wyniki[i]);
    }
}

}
