package DataStructures;

public class magic {
    public static void main(String[] args) {
        String string = new String("");
        StringBuilder stringBuilder = new StringBuilder();
        long t1 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            string = string+"a";
        }
        long t2 = System.currentTimeMillis();
        for( int i=0;i<100000;i++){
            stringBuilder.append('a');
        }
        long t3 = System.currentTimeMillis();
        System.out.println("string execution time:"+(t2-t1));
        System.out.println("stringbuilder execution time:"+(t3-t2));
    }
}
