package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list.contains(5));
        list.set(2, 5);
        Object[] arr = list.toArray();
        System.out.println(arr[1]);
        for (int j : list) {

            System.out.println(j);
        }


    }
}

