package pl.sda.zadanie;

public class ZadanieTrzecieVarArgs {

    public static int dodawanie(int[]... tablice){
        int suma = 0;
        for (int i = 0; i<tablice.length; i++){

            for (int j =0; j< tablice[i].length; j++){
                suma += tablice[i][j];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] tab1 = {10,10,10};
        int[] tab2 = {11,11,11};
        int[] tab3 = {1,2,3};
        System.out.println(dodawanie(tab1,tab2,tab3));
    }
}
