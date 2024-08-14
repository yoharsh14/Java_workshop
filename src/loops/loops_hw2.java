//import java.util.Scanner;
//
//public class loops_hw2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int n = scan.nextInt();
//        if(n%3==0){
//            System.out.println("Its a multiple of 3*K");
//        }
//        else{
//            System.out.println(n+" is a multiple of 3(k*"+n%3+")");
//        }
//
//    }
//}
import java.util.*;
import java.util.Scanner;
// Compiler version JDK 11.0.2

class loops_hw2
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer");
        int a= s.nextInt();
        if(a>0)
            System.out.println(a+" is posstive");
        else if(a<0)
            System.out.println(a+" is negative");
        else
            System.out.println(a+ " is neither negative nor positive");
    }
}