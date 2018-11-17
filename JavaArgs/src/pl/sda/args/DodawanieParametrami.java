package pl.sda.args;

public class DodawanieParametrami {

    public static void main(String[] args) {

        int[] liczby = zamienNaLiczby(args);

        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        System.out.println("suma wprowadzonych liczb to: "+ suma);
    }

    private static int[] zamienNaLiczby(String[] args) {
        int[] liczby = new int[args.length];
//        return liczby;

        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = Integer.parseInt(args[i]);
        }
        return liczby;
    }
}


