package TestWiedzy;

public class TypyDanych {
    public static void main(String[] args) {

        String a = "tekst";
        char b = 'a';
        int c = 5;

        c++;
        c *= 2;

        System.out.println(c + (b + a));
        System.out.println(c + (int)b + a);
//        System.out.println(c+ b+a + c);

        System.out.println((int)b);


    }
}
