package pl.sda.abstrakcja.figury;

public abstract class Wielokat extends Figura{
     protected  abstract double[] zwrocBoki();

     @Override
     public double obliczObwod() {
          double[] boki = zwrocBoki();
          double wynik = 0;

          for(double bok: boki){
               wynik +=bok;
          }
          return wynik;
     }


}
