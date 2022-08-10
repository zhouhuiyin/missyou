package thread;

public class ThreadDemo1{
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁呀？");
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("我是查水表的");
        }
    }
}