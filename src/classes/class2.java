package classes;

public abstract class class2 extends class1{
//    class1 is the parent of class1
     int myValue2 = 10;

    @Override
    void print1() {
        super.print1();
        System.out.println("new print statment");
    }
    @Override
    void pritn6() {
        System.out.println("sjadjlfj");
    }

    public static void main(String[] args) {
        class2 obj = new class2(){
            @Override
            void pritn5() {

            }
        };
        System.out.println(obj.myValue1);
        class2 object = new class2(){
            @Override
            void pritn5() {

            }
        };
        object.print1();
        System.out.println(object.myValue1);
        System.out.println(object.percent);
        }

        Thread th = new Thread(){
            @Override
            public void run() {
                super.run();

                System.out.println("fuhfur");
            }
        };

//        class1 a = new class1();//defalut class cannot be use in other packages but it is accsible in the same pacakge.


}

