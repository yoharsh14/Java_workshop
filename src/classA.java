
public class classA extends B {
    public static void main(String... args){
        classA a = new classA();
        a.print1();
        a.print2();

    }
    void s(){

     System.out.println("hel");
    }
}
class B extends C{
    B(){
        System.out.println("constructor");
    }
    void print1(){
        System.out.println("Hello");
    }

}
class C{
    void print2(){
        System.out.println("World");
    }
    void sup(){
        System.out.println("super print");
    }
}