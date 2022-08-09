package d01;

public class MatchesDemo {
    public static void main(String[] args) {
        String email = "addf_d@126.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }
        String str = "test.iml";
        String regex1 = ".*m.*";
        boolean match1 = str.matches(regex1);
        System.out.println(match1);

    }
}