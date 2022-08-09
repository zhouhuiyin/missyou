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
            System.out.println("等待客户端连接。。。");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户连接了。。。");
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader bf = new BufferedReader(isr);
            String line = bf.readLine();
            System.out.println("客户端说："+ line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
