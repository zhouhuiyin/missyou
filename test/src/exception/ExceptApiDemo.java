package exception;


public class ExceptApiDemo {
    public static void main(String[] args){
        System.out.println("程序开始了。。。");
        String str = "abc";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("程序结束了。。。");
    }
}
