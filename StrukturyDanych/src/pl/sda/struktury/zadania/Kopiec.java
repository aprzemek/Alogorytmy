package pl.sda.struktury.zadania;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Kopiec {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        Random gen2 = new Random();

        for (int i = 0; i <50 ; i++) {

            heap.add(gen2.nextInt(100));
        }

        System.out.println(heap);

        do {

            System.out.println(heap.poll()+",");
            }while (!heap.isEmpty());


    }
}
