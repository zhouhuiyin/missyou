package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于线程切换实际不确定，导致操作顺序出现混乱。
 * 临界资源：操作该资源的完整步骤同一时刻只能有单一线程进行的资源。
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }

}


class Table{
    private int beans = 20;
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("没有豆子了");
        }
        Thread.yield();//主动放弃本次剩余时间片，模拟CPU执行到这里没有时间而发生切换并发问题
        return beans--;
    }
}