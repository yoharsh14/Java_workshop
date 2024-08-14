import java.util.ArrayList;
import java.util.Scanner;

public class stinghw {
    public static void main(String[] args) {
        int s=0;
        Scanner scan = new Scanner(System.in );
        System.out.print("Input string: ");
        String srt = scan.nextLine();
        System.out.println(srt.length());
        System.out.println(srt.charAt(3));
        for(int q = 65;q<=122;q++) {
            char c=(char)q;
            for(int t =0;t<srt.length();t++){
                if(srt.charAt(t)== c){
                    System.out.println(c+"->"+srt.indexOf(c));
                }
            }

        }
    }
}
