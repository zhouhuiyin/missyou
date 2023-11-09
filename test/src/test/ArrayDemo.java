package test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        List a =Arrays.asList("1","2");
        System.out.println(Arrays.deepToString(ns));
        System.out.println(a);
    }


}
