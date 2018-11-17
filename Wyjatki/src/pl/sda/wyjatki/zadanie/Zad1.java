package pl.sda.wyjatki.zadanie;

import java.util.Random;
import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");

        Random losowanie = new Random();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println(losowanie.nextInt(100));
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj drugą iliczbę");

        Random losowanie2 = new Random();
        double d = scanner1.nextDouble();
        for (double j=0; j<d; j++)
        {
            System.out.println(losowanie2.nextDouble());
        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj trzecią liczbę");

       // Random losowanie3 = new Random();
        //boolean b = scanner.nextBoolean();
        //for (boolean) {

         //   System.out.println(losowanie3.nextBoolean());

        }


  }

