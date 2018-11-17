package pl.sda.varargs;

public class Kalkulator {

    public int dodaj(int... liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        return suma;
    }

    public int odejmij(int... liczby) {
        return dodaj(liczby) - 2 * liczby[0];
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        if (args.length == 0) {
            System.out.println("Nie wybrano działania");
            return;
        }
        String dzialanie = args[0];
        args[0] = "0";
        int[] liczby = zamienNaLiczby(args);

        switch (dzialanie) {
            case "+":
                System.out.println("Wynik dodawania to " + kalkulator.dodaj(liczby));
                break;
            case "-":
                System.out.println("Wynik odejmowania to " + kalkulator.odejmij(liczby));
                break;
        }
    }

    private static int[] zamienNaLiczby(String[] args) {
        int[] liczby = new int[args.length];
        for (int i = 0; i < liczby.length; i++) {
            try {

                liczby[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println(liczby[i] + "nie jest liczbą");
            }
            liczby[i] = Integer.parseInt(args[i]);
        }
        return liczby;


    }
}