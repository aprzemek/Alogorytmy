package pl.sda.petle.petlawhile;

public class PetlaNieskonczona {
    public static void main(String[] args) {

        int licznik = 0;
        while (true){
//            System.out.println("Hello");
            System.out.println(licznik);
            licznik++;
            if (licznik>100){
                break;
            }
        }
    }
}
