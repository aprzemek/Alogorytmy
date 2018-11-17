package slowa;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Zapis {
    public void zapisSlowPowyzej10Liter(List<String> lista, Path path){
        Charset set = Charset.forName("UTF-8");
        try(BufferedWriter writer = Files.newBufferedWriter(path, set)){
            for (String slowo : lista)
            {
                if (slowo.length()>9){
                    writer.write(slowo);
                    writer.newLine();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }}
