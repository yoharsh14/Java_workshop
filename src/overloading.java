public class overloading {
    public static void main(String[] args) {
    }
    static int area(int num,int num1){
        return area(num,num1);
    }
    static int area(int radius){
        return (int)3.14*radius*radius;
    }
    static void area(float l , float b){
        System.out.println(l*b);
    }



}
