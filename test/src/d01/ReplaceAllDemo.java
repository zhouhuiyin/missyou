package d01;

public class ReplaceAllDemo {


    public static void main(String[] args) {
        String str = "adaf123sdfdf345gdsg";
        str = str.replaceAll("[a-z]+","#");
        System.out.println(str);
        String str2 = new String("#123#345#");
        boolean a = str.equals(str2);
        boolean a2 = str2 == str;
        System.out.println(a);
        System.out.println(a2);
    }
}
