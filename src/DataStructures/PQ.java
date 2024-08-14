package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//Min heap implementation
        PriorityQueue<Integer> pQMax = new PriorityQueue<>(Collections.reverseOrder());//Max heap implementation
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(9);

        for(int i=0;i<5;i++){
            int elment1 = priorityQueue.poll();
            System.out.println(elment1+" ");
        }
        System.out.println("---------------------");
        pQMax.add(90);
        pQMax.add(9);
        pQMax.add(0);
        pQMax.add(2);
        pQMax.add(44);

        for(int i=0;i<5;i++){
            int elmente1 = pQMax.poll();
            System.out.println(elmente1+" ");
        }
    }
}

