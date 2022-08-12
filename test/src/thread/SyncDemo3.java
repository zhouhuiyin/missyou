package thread;

/**
 * 静态方法上面若使用synchronize修饰，则该方法一定具有同步效果。
 * 静态方法上指定后使用同步监视器不是this，而是当前类的类对象（class的实例）
 * 注：
 * JVM中每个被加载的类都有且只有一个class实例与之对应
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run(){
                Foo.dosome();
            }
        };
        Thread t2 = new Thread() {
            public void run(){
                Foo.dosome();
            }
        };
        t1.start();
        t2.start();
    }


}

class Foo{
    public synchronized static void dosome(){
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()+"：正在执行dosome方法。。。");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getName()+":执行dosome方法完毕！！");
    }
}