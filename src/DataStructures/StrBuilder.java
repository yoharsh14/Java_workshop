package DataStructures;

public class StrBuilder {
    public static void main(String[] args) {

        //append() :- append at the last of the string
        //SetcharAt() :-
        //deleteCharAt() :-
        //insert() :-
         StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'd');// in this single quotes are used
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);
        stringBuilder.insert(1,"harsh");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.charAt(2));
//        --------
        String s = new String("harsh");
        System.out.println(s);
        s = s+ "dambhare";
        System.out.println(s);
        System.out.println(s.length());
        //in this in the orignal string s dambhare is added and then it is stored back to s, and harsh is
        //clear out

    }
}
