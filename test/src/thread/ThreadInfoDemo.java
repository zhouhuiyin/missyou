package thread;

/**
 * 获取线程相关信息的一种方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        String name = main.getName();
        System.out.println(name);
    }
}
