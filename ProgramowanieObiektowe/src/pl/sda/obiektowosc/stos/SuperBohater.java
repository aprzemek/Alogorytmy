package pl.sda.obiektowosc.stos;

public class SuperBohater {
    public static void main(String[] args) {
        SuperBohater bohater1 = new SuperBohater("Ironman");
        SuperBohater bohater2 = new SuperBohater("Thor");
        SuperBohater bohater3 = new SuperBohater("Doktor Strange");
        //a
        bohater1 = bohater2;
        bohater1 = null;
        System.out.println(bohater2==null);
        //b
        bohater1 = null;
        bohater2 = bohater1;
        bohater1 = bohater3;
        System.out.println(bohater1==null);
        System.out.println(bohater2==null);
        System.out.println(bohater3==null);

    }
    String nazwa;
    String supermoc;

    String imie;

    public SuperBohater(String imie) {
        this.imie = imie;


    }

}
