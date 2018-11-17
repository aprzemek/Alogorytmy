package pl.sda.abstrakcja.figury;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Prostokat p = new Prostokat(4,5);
        System.out.println(p.obliczPole());
        System.out.println(p.obliczObwod());
        System.out.println(Arrays.toString(p.zwrocBoki()));

        Kwadrat k = new Kwadrat(10);
        System.out.println(k.obliczPole());
        System.out.println(k.obliczObwod());
        System.out.println(Arrays.toString(k.zwrocBoki()));

        Kolo kol = new Kolo(4);
        System.out.println(kol.obliczPole());
        System.out.println(kol.obliczObwod());


    }
}
