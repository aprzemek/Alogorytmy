import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        LocalDateTime datetime = LocalDateTime.now();
        LocalTime time = LocalTime.now();

        Scanner scanner = new Scanner(System.in);
        String warunek = scanner.nextLine();

        switch (warunek) {
            case "date":
                System.out.println(date);
            break;

            case "time":
                System.out.println(time);
            break;

            case "datetime":
                System.out.println(datetime);
            break;

            case "quit":
                System.out.println("koniec");
            break;
        }

    }


}