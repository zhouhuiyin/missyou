package socket;

import java.io.IOException;
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

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
