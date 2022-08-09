package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if(age<0||age>100){
            throw new IllegalAgeException("年龄不合法!!");
        }
        this.age=age;
    }
}

class TestDemo {
    public static void main(String[] args){
        Person p = new Person();
        try {
            p.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }
}
