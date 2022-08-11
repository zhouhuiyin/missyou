package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();
        System.out.println(main);
        dosome();
    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println(t);

    }
}
