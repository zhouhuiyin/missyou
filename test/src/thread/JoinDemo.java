package thread;
//线程的同步运行可以使用join方法
public class JoinDemo {
    private static boolean isFinish = false;
    public static void main(String[] args) {
        Thread dowload = new Thread(){
            public void run(){
                System.out.println("down:开始下载图片....");
                for(int i=1;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("down:下载完毕");
                isFinish = true;
            }
        };
        Thread show = new Thread(){
            public void run(){
                System.out.println("开始显示商品列表");
                System.out.println("显示列表中国呢的文字");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("列表中的文字显示完毕");
                System.out.println("开始显示图片。。。");
                try {
                    dowload.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(!isFinish){
                    throw new RuntimeException("图片加载失败");
                }
                System.out.println("显示图片完毕");
            }
        };

        dowload.start();
        show.start();
    }

}
