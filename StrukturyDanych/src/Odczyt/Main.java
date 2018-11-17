package Odczyt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("c:/sda/slowa.txt");
        Path destinationFile = Paths.get("c:/sda/wyselekcjonowane.txt");
        Charset charset = Charset.forName("UTF-8");
        try(BufferedReader reader = Files.newBufferedReader(sourceFile, charset);
            BufferedWriter writer = Files.newBufferedWriter(destinationFile, charset)) {
            String word;
            while ((word = reader.readLine()) != null) {
                if(word.length()>10) {
                    writer.write(word);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n:", e);
        }
    }
}
