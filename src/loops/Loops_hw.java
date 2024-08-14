import java.util.ArrayList;
import java.util.Scanner;

 class Loops_hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.print("enter number till you want to find prime numbers: ");
        int n = scan.nextInt();
        int i,j,count,times=0;
        for(i=2;i<=n;i++){
            count = 0;
            for(j=1;j<=i;j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count == 2){
                array.add(i);
                times++;

            }
           else if(times==100){
                System.out.println(times);
                break;
            }
        }
        System.out.println("all the prime numbers between 2 to "+n+" are: "+array);
    }
}
