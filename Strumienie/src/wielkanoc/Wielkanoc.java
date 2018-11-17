package wielkanoc;

import java.util.Scanner;

public class Wielkanoc {
    public static void main(String[] args) {

        System.out.println("podaj rok");
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();

        int a = rok % 19;
        int b = rok / 100;
        int c = rok % 100;
        int d = b / 4;
        int e = b % 4;
        int f = ((b + 8) / 25);
        int g = ((b - f + 1) / 3);
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int p = (h + l - 7 * m + 114) % 31;

        int dzieWielkanocy = p + 1;
        int miesiąc = (h + 1 - 7 * m + 114) / 31;

        if (miesiąc ==4){

            System.out.println("Wielkanoc wypada: "+dzieWielkanocy+" kwietnia "+rok);

        }else {
            System.out.println("Wielkanoc wypada: "+dzieWielkanocy+" marca "+rok);
        }

    }
}