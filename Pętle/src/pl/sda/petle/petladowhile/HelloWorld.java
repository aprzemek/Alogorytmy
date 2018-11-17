package pl.sda.petle.petladowhile;
//petla do while
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        int liczba, licznik, suma;
        licznik = suma = 0;

        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();

        do {
//            System.out.println("hello world!");

            suma += licznik;
            licznik++;

        } while (licznik <= liczba);

        System.out.println("suma wprowadzonych liczb to :" +suma);
    }
}
