package pl.sda.skaner.Echo;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String echo = scanner.nextLine();

        System.out.println("Echo :"+echo);
    }
}
