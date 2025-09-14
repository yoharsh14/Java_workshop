package multithreading;

public class Hello {
    public static void main(String[] args) {
        World t1 = new World();
        System.out.println(t1.getName()+" "+t1.getState());
        t1.start();
        System.out.println(t1.getName()+" "+t1.getState());

        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println(t1.getName()+" "+t1.getState());
//        for (;;){
            System.out.println("hello");
//        }
        System.out.println(t1.getName()+" "+t1.getState());
    }
}
