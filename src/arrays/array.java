import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        how to initialize static array
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0;i<=5;i++){
            System.out.print("Enter the value at position "+i+" :");
            int input = sc.nextInt();
            arr[i] = input;
        }
        //        How to Initialize dynamic array

        ArrayList<Integer> myFirsArray = new ArrayList<>();
        Scanner scan = new Scanner((System.in));
        System.out.print("Enter How many elements you want to input :");
        int a = scan.nextInt();
        int j =0;
        while(j<=a){
            System.out.print("Enter element at position "+j+" :");
            int b = scan.nextInt();
            myFirsArray.add(a);
        }


    }
}
