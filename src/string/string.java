import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
//        String c = scan.nextLine();
        //easy way
        String name = new Scanner(System.in).nextLine();
        System.out.println("Your name is: "+name);
        System.out.println(name.toUpperCase());
        System.out.println(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println("orignal string "+name);
        System.out.println(name.compareTo("Harsh"));
        System.out.println(name.equals("Harsh"));
        //it will return index of string form where the string is starting
        System.out.println(name.indexOf("Dambhare"));
        //it will return index of string
        System.out.println(name.indexOf("Stone",2));
        System.out.println(name.indexOf("h",3));
        System.out.println(name.replace("h","s"));
        String[] words = name.split("\\.");
        for(String word : words){
            System.out.println(word);
        }

    }
}
