import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of rows you want:");
        int row = scan.nextInt();
        System.out.print("enter number of column you want:");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter element position "+i+","+j+":");
                arr[i][j] = scan.nextInt();
            }
        }
        //main code
        for(int j=0;j<arr[0].length;j++){
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
                else {
                    for(int i=arr.length-1;i>=0;i--){
                        System.out.println(arr[i][j]);
                    }

                }
            }
//            System.out.println(" ");
        }
//        for (int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
    }

