package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
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
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bf = new BufferedReader(isr);
                String message;
                while ((message = bf.readLine()) != null) {
                    System.out.println(host +"客户端说：" + message);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
