package pl.sda.struktury.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Kop2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> losoweLiczby = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            losoweLiczby.add(rand.nextInt(100));
        }
        System.out.println(losoweLiczby.toString());

        PriorityQueue<Integer> posortowane = new PriorityQueue<>(losoweLiczby);

        do {
            System.out.print(posortowane.poll() + ", ");
        }while (!posortowane.isEmpty());
    }
}
