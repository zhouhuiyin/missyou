package d01;

import javax.naming.Name;

public class Test{
    public static void main(String[] args) {
        Son son1 = new Son("jack");

    }

}



//创建一个父类
class Father{
    //无参构造方法
    public Father(String name){
        System.out.println("father的一个有参构造方法");;
    }
    public Father(){
        System.out.println("father的一个无参构造方法");
    }
}

//创建一个子类
class Son extends Father{
    private String name;
    //无参构造方法
    public Son(){
        super("jacky");
        System.out.println("son的一个无参构造方法");
    }

    //有参构造方法
    public Son(String name){
        super(name);
        this.name = name;
        System.out.println("son的一个有参构造方法");
    }
}