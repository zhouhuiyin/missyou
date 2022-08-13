package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

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
            //启动用于读取服务器端发送过来的消息线程
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.start();
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    private class ServerHandler implements Runnable{
        //通过socket获取输入流获取服务端发送过来的消息
        public void run(){
            try {
                BufferedReader bf = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()
                        )
                );
                String message;
                while((message = bf.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                //throw new RuntimeException(e);
            }
        }
    }


}
