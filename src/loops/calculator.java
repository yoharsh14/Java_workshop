import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter first number: ");
        int firstNum = scan.nextInt();
        do {
            System.out.print("enter second number: ");
            int secondNum = scan.nextInt();
            System.out.println("which operation you want to perform:");
            System.out.println("+ -");
            System.out.println("* /");
            System.out.print("Enter your operator: ");
            scan.nextLine();
            int result = 0;
            String operation = scan.nextLine();
            if (operation.contentEquals("+")) {
                result = firstNum + secondNum;
            } else if (operation.contentEquals("-")) {
                result = firstNum - secondNum;
            } else if (operation.contentEquals("*")) {
                result = firstNum * secondNum;
            } else if (operation.contentEquals("/")) {
                result = firstNum / secondNum;
            }
            System.out.println(firstNum + operation + secondNum + "=" + result);
            System.out.println("result="+result);
            firstNum = result;
            System.out.print("You want to continue with the same result or terminate(Y/N):");

            String choice = scan.next();
            if(choice.contentEquals("y")||choice.contentEquals("Y")){
                continue;
            }else if(choice.contentEquals("n")||choice.contentEquals("N")){
                break;
            }
        }while(true);
    }
}