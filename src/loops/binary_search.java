import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("you can only enter 6 elements and enter array in ascending order");
        int array[]=new int[6];
        for(int i =0;i<6;i++){
            System.out.print("enter element at position "+i+" :");
            int p = scan.nextInt();
            array[i] = p;
        }
        System.out.print("which element you want to find: ");
        int target = scan.nextInt();
        int mid = 0;
        int low=0,high=array.length;

        while (low<=high){
            mid = (low+high)/2;
            if(array[mid]<target){
                low = mid+1;
            }
            else if(array[mid]>target){
                high = mid -1;
            }
            else if(array[mid]==target){
                System.out.println("element is at position: "+mid);
                break;
            }
        }
    }
}
