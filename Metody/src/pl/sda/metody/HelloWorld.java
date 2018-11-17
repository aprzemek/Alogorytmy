package pl.sda.metody;

public class HelloWorld {

    public static void main(String[] args) {
        hello();
        hello("Przemek");
        hello("Stefan  ");
duppaDu();

    }

    private static void hello(String imie) {
        System.out.println("hello " + imie);


    }

    public static void hello() {
        System.out.println("hello World!");
    }
public static void duppaDu(){
            System.out.println("witam");
        }


    }

