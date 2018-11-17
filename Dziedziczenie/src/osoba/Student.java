package osoba;

public class Student extends Osoba {
    private int numerAlbumu;

    public Student(String imie, String nazwisko, int wiek, int numerAlbumu) {
        super(imie, nazwisko, wiek);
        this.numerAlbumu = numerAlbumu;
    }

    public void pokazIndeks(){
        System.out.println("moj nr albumu to: "+ this.numerAlbumu);
    }

    @Override
    public void przedstawSie() {
        System.out.println("siema jestem studnetem, nazywam się "+ imie +" "+ nazwisko);
    }
}
