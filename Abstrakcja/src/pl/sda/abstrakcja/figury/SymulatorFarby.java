package pl.sda.abstrakcja.figury;

public class SymulatorFarby {
    public static int obliczaZapotrzebowanieNaFarbe(Figura [] figury, double wielkoscPojemnika){
        double powierzchnia = 0;

        for (Figura f: figury){
            powierzchnia += f.obliczPole();
        }
        System.out.println("Całkowita powirzchnia do pomalowania wynosi " + powierzchnia);
        return (int)Math.ceil(powierzchnia/wielkoscPojemnika) ;
    }
}