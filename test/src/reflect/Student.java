package reflect;

@AutoRunClass
public class Student {
    @AutoRun
    public void study(){
        System.out.println("学生：good good study,day day up!");
    }
    @AutoRun

    public void playGame(){
        System.out.println("学生：玩游戏");
    }

    public void say(){
        System.out.println("学生：大家好!");
    }
}
