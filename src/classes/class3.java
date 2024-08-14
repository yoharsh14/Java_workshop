package classes;

public class class3 extends class2{
//    class2 is the parent of class3
int myValue3 = 14;

    public static void main(String[] args) {
        class3 object = new class3();
        System.out.println(object.myValue1);
        System.out.println(object.myValue2);
        System.out.println(object.myValue3);
        object.print1();
    }

    @Override
    void pritn5() {
        System.out.println("hwllo");
    }
    class3 a = new class3();

}
