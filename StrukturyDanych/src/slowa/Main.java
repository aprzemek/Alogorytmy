package slowa;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path pathSource = Paths.get("C:/sda/slowa.txt");
        Path pathNew = Paths.get("C:/sda/wyl.txt");
        Odczyt odczyt = new Odczyt();
        Zapis zapis = new Zapis();

        List<String> slowa = odczyt.odczytajZPliku(pathSource);

        zapis.zapisSlowPowyzej10Liter(slowa, pathNew);
    }
}
