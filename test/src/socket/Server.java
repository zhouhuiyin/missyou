package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    private ServerSocket serverSocket;
    private PrintWriter[] allOut = {};
    public Server(){
        try {
            System.out.println("正在启动服务端。。。");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void start(){
        try {
            while(true) {
                System.out.println("等待客户端连接。。。");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户连接了。。。");
                //启动一个线程与客户端交互
                ClientHandler c = new ClientHandler(socket);
                Thread t = new Thread(c);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务用于与确定的客户端进行交互。
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//客户端的地址信息
        public ClientHandler(Socket socket){
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            try{
                InputStream in = socket.getInputStream();
                //转换流，衔接字符与字节流，将读取的字节流转换为字符
                InputStreamReader isr = new InputStreamReader(in);
                //缓冲流，块读文本数据加速，按行读取字符串
                BufferedReader bf = new BufferedReader(isr);
                //通过socket获取输出流用于给客户端回复消息
                OutputStream out = socket.getOutputStream();
                //转换流，负责衔接字符与字节流，将写出的字符转换为字节
                OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
                //缓冲流，负责块写文本数据加速
                BufferedWriter bw = new BufferedWriter(osw);
                //按行写出字符串，自动行刷新
                PrintWriter pw = new PrintWriter(bw,true);
                //扩容
                allOut = Arrays.copyOf(allOut,allOut.length+1);
                //将输出流存入数组最后一个位置
                allOut[allOut.length-1] = pw;

                String message;
                while ((message = bf.readLine()) != null) {
                    System.out.println(host +"客户端说：" + message);
                    //将消息回复给客户端
                    pw.println(host+"说："+message);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
