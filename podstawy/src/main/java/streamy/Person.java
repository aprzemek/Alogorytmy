package streamy;
//1.Napisz klasę person, która ma pola: firstName, lastName, age oraz isMale.
//        Mając listę osób i korzystając ze streamów:
//        a) uzyskaj listę mężczyzn
//        b) uzyskaj listę dorosłych kobiet
//        c) uzyskaj Optional<Person> z dorosłym Jackiem
//        d) uzyskaj listę wszystkich nazwisk osób, które są w przedziale wiekowym: 15-19
//        e)* uzyskaj sumę wieku wszystkich osób
//        f)* uzyskaj średnią wieku wszystkich mężczyzn
//        g)** znajdź nastarszą osobę w liście


public class Person {

    String firsName;
    String lastName;
    int age;
    boolean isMale;

    public Person(String firsName, String lastName, int age, boolean isMale) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }




    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                '}';
    }
}

