package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。");
        try{
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            System.out.println("程序出错了");
        }finally {
            System.out.println("finally代码只行了");
        }
        System.out.println("程序结束了");
    }
}
