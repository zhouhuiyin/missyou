package reflect;

import java.util.Arrays;

public class ArgsDemo {
    public static void main(String[] args) {
        dosome("a");
        dosome("a","b");
        dosome("a","c","e");
        dosome("a","d","e","f");
    }
    public static void dosome(String... arg){
        System.out.println(arg.length);
        System.out.println(Arrays.toString(arg));
    }
    

}
