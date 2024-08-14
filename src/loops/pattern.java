import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("You want to print elements till: ");
//        int b = scan.nextInt();
//        int i,j;
//        int c =1;
//        for(i=1;i<=b;i++){
//            for (j=1;j<i;j++){
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//        }

        for(int i=1;i<=8;i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
