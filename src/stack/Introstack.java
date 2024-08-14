package stack;

import java.util.Scanner;
import java.util.Stack;

public class Introstack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declaration of stack
        Stack<Integer> stack =new Stack<>();
        //push(); - it is used to insert the element in the stack
        //pop(); - it is used to delete the element from the top of the stack
        //peek(); -it is used to display the element present at the top of the stack
        System.out.print("enter total number of elements you want to enter: ");
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("enter element:");
            int number= scan.nextInt();
            stack.push(number);
        }
        System.out.println(stack);
        System.out.println("-------------");
        for(int i=0;i<n;i++){
            System.out.print(stack);
            int topElementOfTheStack = stack.pop();
            System.out.println(" "+topElementOfTheStack+" ");
            System.out.println();

        }
    }
}
