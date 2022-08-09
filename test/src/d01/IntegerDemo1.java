package d01;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int num = 127;
        Integer i1 = Integer.valueOf(num);
        Integer i2 = Integer.valueOf(num);
        int in = i1.intValue();
        System.out.println(i1==i2);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String s = "123";
        num = Integer.parseInt(s);
        System.out.println(num);


    }
}
