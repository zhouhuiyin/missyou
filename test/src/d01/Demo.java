package d01;

public class Demo {
    public static void main(String[] args) {
        String str = "好好学习java";
        StringBuilder builder = new StringBuilder(str);
        builder.append("是为了找到好工作");
        builder.replace(builder.indexOf("为"),builder.indexOf("作")+1,"改变世界");
        String line = builder.toString();
        System.out.println(line);
    }
}


