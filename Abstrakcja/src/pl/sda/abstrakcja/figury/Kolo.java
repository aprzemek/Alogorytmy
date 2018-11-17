package pl.sda.abstrakcja.figury;

public class Kolo extends Figura{
    protected static final double pi = 3.1415926;
    private double promien;

    //konstruktor


    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObwod() {
        return 2*pi*promien;
    }

    @Override
    public double obliczPole() {
        return pi*promien*promien;
    }
}
