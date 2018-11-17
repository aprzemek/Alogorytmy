package pl.sda.metody;

public class ParzysteLiczby {  public static void main(String[] args) {
    drukujParzystoscLiczby(4);
    drukujParzystoscLiczby(3);
    System.out.println(czyLiczbaJestParzysta(8));
}

    private static boolean czyLiczbaJestParzysta(int liczba) {
        return liczba%2==0;
    }

    private static void drukujParzystoscLiczby(int liczba) {
        if (czyLiczbaJestParzysta(liczba)){
            System.out.println("Liczba "+liczba+" jest parzysta");
        }else {
            System.out.println("Liczba "+liczba+" jest nieparzysta");
        }
    }
}

