public class Enum {
    enum Grade{
        FIRST,
        SECOND,
        THIRD,
        FOURT
    }

    public static void main(String[] args) {
        Grade grade = Grade.FIRST;
        System.out.println(grade);

        int[] arr = {1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int j :arr) {
            System.out.println(j);
        }
    }
}
