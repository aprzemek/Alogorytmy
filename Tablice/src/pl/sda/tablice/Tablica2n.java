package pl.sda.tablice;

public class Tablica2n {

    public static void main(String[] args) {
        int[][] tablica2n = new int[3][3];
        int k=0;
        for(int i=0; i<tablica2n.length; i++) {
            for(int j=0; j<tablica2n[i].length; j++) {
                tablica2n[i][j] = k;
                k++;
            }
        }
        for(int i=0; i<tablica2n.length; i++) {
            for(int j=0; j<tablica2n[i].length; j++) {
                System.out.print(tablica2n[i][j] + " ");
            }
            System.out.println();
        }
    }
}