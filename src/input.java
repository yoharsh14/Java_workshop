import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter roll number: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your name: ");
        String ch = scan.nextLine();
        System.out.print("Enter your percentage: ");
        float fl = scan.nextFloat();
        System.out.println("Your roll number is: "+a);
        System.out.println("your percentage is: "+fl+"%");
        System.out.println("Name: "+ch);
        System.out.println();
        if(fl>90){
            System.out.println("FIRST DEGREE");
        }
        else if(fl>80&&fl<90){
            System.out.println("SECOND DEGREE");
        }
        else if(fl>75&&fl<80){
            System.out.println("THIRD DEGREE");
        }
        else{
            System.out.println("NOTHING");
        }

    }
}
