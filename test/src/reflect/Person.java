package reflect;


import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
@AutoRunClass
public class Person {
    private String name = "张三";
    private int age = 22;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @AutoRun(5)
    public void sayHello(){
        System.out.println("Person:hello!");
    }

    public void sayGoodBye(){
        System.out.println("Person:sayGoodBye!");
    }

    @AutoRun(3)
    public void watchTV(){
        System.out.println("Person:看电视");
    }

    public void say(String info){
        System.out.println(name + "说："+ info);
    }

    public void say(String info,int count){
        for(int i=0;i<count;i++){
            System.out.println(name+"说："+info);
        }
    }

    private void hehe(){
        System.out.println("我是Person中的私有方法！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
