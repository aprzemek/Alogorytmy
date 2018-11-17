package pl.sda.struktury.zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Slowa {
    public static void main(String[] args) {


        Path file = Paths.get("C:/Użytkownicy/Przemek/Pobrane/slowa.txt");
        Charset charset = Charset.forName("UTF-8");

        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

            System.err.format("IOException: %s%n", e);

        }
    }
}