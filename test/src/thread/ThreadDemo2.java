package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建任务实例
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //创建线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}


class MyRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁呀？");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("我是查水表的？");
        }
    }
}