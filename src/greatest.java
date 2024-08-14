import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter first elemetn: ");
        int a = scan.nextInt();
        System.out.print("enter second elemtnt: ");
        int b = scan.nextInt();
        System.out.print("enter third element: ");
        int c = scan.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is the greatest  element than"+c+","+b);
        }
        if(b>a&&b<c){
            System.out.println(b+" is the greatest element than"+c+","+a);
        }
        else {
            System.out.println(c+" is the greatest element than"+a+","+b);
        }
    }
}
