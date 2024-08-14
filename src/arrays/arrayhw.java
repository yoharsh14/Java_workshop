import java.util.Scanner;

public class arrayhw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[][] = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.println("entre element at position"+i+" "+j);
                int a = scan.nextInt();
                array[i][j]=a;
            }
        }
        int sum = 0;
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sum=array[i][j]+sum;
                }
            }
        }
    }
}
