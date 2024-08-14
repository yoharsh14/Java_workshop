package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queu {
    public static void main(String[] args) {
        //add() :- add function is used to add element inside the queue
        //pop() :- is used to delete element from the queue
        Queue<Integer> queue; queue = new LinkedList<>();
        queue.add(45);
        queue.add(5);
        queue.add(4);
        queue.add(1);
        int element1 = queue.poll();
        System.out.println("popped value "+element1);
        System.out.println(queue);
        System.out.println(queue.peek());
        int element2 = queue.peek();
        System.out.println(element2);

    }



}
