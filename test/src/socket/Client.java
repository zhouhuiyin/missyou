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
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            //通过socket获取输入流获取服务端发送过来的消息
            BufferedReader bf = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
                line = bf.readLine();//读取服务端发送过来的字符串
                System.out.println(socket.getInetAddress().getHostAddress()+"服务端说："+ line);
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
}
