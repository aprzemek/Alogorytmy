package slowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Odczyt {
    public List<String> odczytajZPliku(Path file){
        Charset set = Charset.forName("UTF-8");
        List<String> lista = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(file, set)){
            String lane = null;
            while ((lane = reader.readLine()) != null){
                lista.add(lane);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return lista;
    }
}
