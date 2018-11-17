package pl.sda.abstrakcja.figury;

public abstract class Czworokat extends Wielokat {
private double[] boki;

    @Override
    protected double[] zwrocBoki() {
        return boki;
    }

    public Czworokat(double a, double b, double c, double d) {
        boki = new double[] {a,b,c,d};


    }
}