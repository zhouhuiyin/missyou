package thread;

public class SleepDemo1 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("睡一会儿");
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        lin.start();
    }
}
