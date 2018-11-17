package pl.sda.obiektowosc.wstep;

import java.util.Scanner;

public class KontoBankowe {

    long numerKonta;
    int stanKonta;
    int kwota;

    Scanner scanner = new Scanner(System.in);

    public void wyswietlStanKonta() {
        System.out.println("Stan konta nuumer " +numerKonta + " wynosi: " +stanKonta + " PLN ");
    }

    public void wplacSrodki() {
        System.out.println("Podaj kwotę którą chcesz wpłacić: ");
        kwota = scanner.nextInt();
        stanKonta = stanKonta +kwota;
        System.out.println("Dokonałeś wpłaty kwoty " +kwota + "PLN. Stan twojego konta wynosi obecnie: " +stanKonta + " PLN.");
    }

    public void pobierzSrodki() {
        System.out.println("Podaj kwotę którą chcesz wypłacić: ");
        kwota = scanner.nextInt();
        stanKonta = stanKonta -kwota;
        System.out.println("Dokonałeś wypłaty kwoty " +kwota + "PLN. Stan twojego konta wynosi obecnie: " +stanKonta + " PLN.");
    }

    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public static void main(String[] args) {

        KontoBankowe kontoAndrzeja = new KontoBankowe (123L,1000);
        KontoBankowe kontoBeaty = new KontoBankowe (555L,2000);

        kontoAndrzeja.wyswietlStanKonta();
        kontoAndrzeja.wplacSrodki();
        kontoBeaty.pobierzSrodki();
    }


}
