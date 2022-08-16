package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出原则
 * 栈可以通过使用双端队列从同一侧作出入队来完成，因此双端队列也为栈提供了其
 * 经典的两个方法：push（入栈） pop（出栈）
 * 实际开发中我们经常使用栈来完成后退，前进这样的功能
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);
        String str = stack.pop();
        System.out.println(str);
        for(String s : stack){
            System.out.println(s);
        }
        while (stack.size()>0){
            String s1 = stack.pop();
            System.out.println(s1);
        }
        System.out.println(stack);
    }
}
