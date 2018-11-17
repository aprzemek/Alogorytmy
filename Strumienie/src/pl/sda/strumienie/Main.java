package pl.sda.strumienie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> listaWyrazow10Znakow(){
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("c:/sda/wyselekcjonowane.txt"))){
            br.lines().forEach(lista::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private static void iloscWystapienA(){
        listaWyrazow10Znakow().stream()
                .mapToInt(Main::liczba)
                .forEach(System.out::println);
    }

    private static int liczba (String slowo){
        int wystapienia =0;
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i)==65 || slowo.charAt(i)==97){
                wystapienia++;
            }
        }
        return wystapienia;
    }

    private static void listaWyrazowZaczynajaceSieOdA(){
        listaWyrazow10Znakow().stream()
                .filter(s -> s.charAt(0)==65 || s.charAt(0)==97)
                .forEach(System.out::println);
    }


}
