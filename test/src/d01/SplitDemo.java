package d01;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        String[] data = str.split("\\d+");
        System.out.println(Arrays.toString(data));
    }
}
