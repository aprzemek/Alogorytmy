package pl.sda.strumienie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Strumie {
    public static void main(String[] args) {


        Stream<String> stream = Stream.empty();


        try {
            File file = new File("c:/sda/wyselekcjonowane.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            stream = bufferedReader.lines();
            System.out.println("Utworzono stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stream<String> filtrowany = stream.filter(i -> i.charAt(0) == 'a');
        filtrowany.forEach(System.out::println);
    }
}