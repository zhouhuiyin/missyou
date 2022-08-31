package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池
        线程池时线程的管理机制，主要解决两个问题
        1.控制线程放入数量
        2.重用线程
        频繁的创建和销毁线程会给系统带来不必要的工作开销，降低并发性能，因此不应当让
        线程的生命周期与执行任务一致，而是任务执行之后可以据需执行其他任务

        控制线程数量可以有效控制资源开销（每个线程都需要占用一部分内存），并且可以避免
        cpu的过度切换出现的并发性能低下的问题
* */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池,创建一个固定大小的线程池，容量为2
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName()+":正在执行任务");
                    try{
                        Thread.sleep(5000);
                    }catch (InterruptedException e){

                    }
                    System.out.println(t.getName()+":执行任务完毕");
                }
            };
            threadPool.execute(r);
            System.out.println("将一个任务交给了线程池");
        }
        threadPool.shutdown();
        System.out.println("线程停止");
    }
}
