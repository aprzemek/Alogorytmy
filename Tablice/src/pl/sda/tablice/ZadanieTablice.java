package pl.sda.tablice;

import java.util.Arrays;

public class ZadanieTablice {

    public static void main(String[] args) {


        int[] liczby = new int[]{1,3,5,10};
        System.out.println("dwaelementy");
        System.out.println(liczby[2]);
        System.out.println(liczby[3]);

        for (int liczba:liczby){
            System.out.println("element pętli");
            System.out.println(liczba);

            System.out.println("wyświetlenie indeksów parzystych");
            for (int i = 0; i < liczby.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(liczby[i]);
                }
            }

            System.out.println("wyświetlenie wartości parzystych");
            for (int i = 0; i < liczby.length; i++) {
                if (liczby[i] % 2 == 0) {
                    System.out.println(liczby[i]);
                }
            }
        }
    }



}
