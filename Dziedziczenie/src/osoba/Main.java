package osoba;

public class Main {

    public static void main(String[] args) {
        Osoba o = new Osoba("Andrzej","Chyra",45);
        Student s = new Student("Janek","Kac",21,1424);

        o.przedstawSie();
        s.przedstawSie();

        System.out.println(o.toString());

        o=s;
        s.pokazIndeks();
        ((Student)o).pokazIndeks();
    }
}
