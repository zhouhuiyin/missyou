package thread;


//守护线程
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i=0;i<5;i++){
                    System.out.println("rose:let me go");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊。。。。。");
                System.out.println("噗通");
            }
        };

        Thread jack = new Thread() {
            public void run(){
                while(true){
                    System.out.println("jack:you jump i jump!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        rose.start();
        //设置守护线程必须在线程启动之前
        jack.setDaemon(true);
        jack.start();
    }
}
