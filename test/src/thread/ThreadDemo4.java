package thread;

import java.util.Scanner;

public class ThreadDemo4 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number>=0){
            System.out.println(number);
            number--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序运行完毕！");
    }
}
