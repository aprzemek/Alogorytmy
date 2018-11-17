package pl.sda.intro.hello;

public class PierwszyProgram {

    public static void main(String[] args) {

        String hello = "HelloWorld";
        System.out.println(hello);

        String MamNaImie = "Mam na imię";
        System.out.println(MamNaImie);

        String twojeimie = "Przemek";
        System.out.println(twojeimie);

        // "\n" - spacja - ważne

        String zadanie3 = hello + "\n" + MamNaImie + "\n" + twojeimie;
        System.out.println(zadanie3);
    }
}
