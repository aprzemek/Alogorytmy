package pl.sda.tablice;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Imiona {

    public static void main(String[] args) {

        String[] imiona = new String[]{"Seba", "Janusz", "Grażyna", "Dżesika", "Brajan", "Mirek,", "Mariusz", "Jarosław"};

        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);

        }
        imiona[5] = "Damian";

        System.out.println(Arrays.toString(imiona));

        Arrays.sort(imiona);

        System.out.println(Arrays.toString(imiona));

        wyswietlTylkoPanie(imiona);
    }

    private static void wyswietlTylkoPanie(String[] imiona) {
        System.out.println("Tylko panie");

        for (String imie : imiona) {

            if (!czyImieKobiece(imie)) {
                System.out.println(imie);


            }

        }
    }

    private static boolean czyImieKobiece(String imie) {
        return imie.endsWith("a") && !imie.equals("Seba");


    }

}