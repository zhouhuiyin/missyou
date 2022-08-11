package thread;

/**
 * 同步块
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop s = new Shop();
        Thread t1 = new Thread("edg"){
            public void run(){
                s.buy();
            }
        };
        Thread t2 = new Thread("rng"){
            public void run(){
                s.buy();
            }
        };
        t1.start();
        t2.start();
    }

}

class Shop{
    public void buy(){
        Thread t = Thread.currentThread();
        try{
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);
            /**
             * 同步块可以更灵活准确的锁定需要排队的代码片段
             * 使用同步块需要指定同步监视器对象，它可以是java中任何引用类型的实例
             * 只要保证多个需要排队执行该代码的线程看到的这个对象是同一个即可。
             */
            synchronized (this){
                System.out.println(t.getName()+":正在试衣服...");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+"正在结账...");

        }catch (Exception e){

        }
    }
}