import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int a = scan.nextInt();
        System.out.println(factorial(a));
    }
    static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
