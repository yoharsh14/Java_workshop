import java.util.Scanner;

public class OOPS {

    public static void main(String[] args) {
        registerStudent(1,"harsh","greater noida",213112323l);
        Scanner scan = new Scanner(System.in);
        System.out.print("which element you want to be squared: ");
        int b = scan.nextInt();
        System.out.println(square(b));
    }
    static  void registerStudent(int roll,String name,String address, long phone){
        if(roll<0) {
            System.out.println("Invalid roll number");
        }
        }
    static int square(int num){
        int a = num*num;
        return a;
    }
}
