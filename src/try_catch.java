import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input a your email: ");
       try {
           int a = scan.nextInt();
           System.out.println(a/0);
       }
       catch (Exception e){
           System.out.println("error");
       }
       finally {
           System.out.println("finally");
       }
    }
}
