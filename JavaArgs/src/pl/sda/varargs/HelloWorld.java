package pl.sda.varargs;

public class HelloWorld {

    private static void hello(String... imiona){

        for(String imie:imiona){
            System.out.println("hello " + imie);


        }
    }

    public static void main(String[] args) {

        hello();
        hello("Jan", "Adam","Beata");
        hello(" ",null);


    }
}
