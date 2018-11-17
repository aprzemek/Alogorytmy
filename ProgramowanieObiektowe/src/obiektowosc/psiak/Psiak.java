package obiektowosc.psiak;

public class Psiak {
    String imie;
    int wiek;
    String kolor;

    private void dajGlos(){
        for (int i = 0; i< wiek; i++){


        System.out.println("hau hau");}

    }

    public static void main(String[] args) {
        Psiak burek = new Psiak();
        burek.wiek = 2;
        burek.imie = "Azor";
        burek.kolor = "czarny";
        burek.dajGlos();

        Psiak corgi =  new Psiak();
        corgi.imie = "Mietek";
        corgi.wiek = 3;
        corgi.kolor = "zielony";
        corgi.dajGlos();

    }


}
