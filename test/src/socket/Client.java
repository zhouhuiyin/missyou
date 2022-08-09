package socket;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器。。。");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立了连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            pw.println("你好服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
