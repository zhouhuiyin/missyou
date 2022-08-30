package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个注解
 *
 * 定义一个注解
 *
 *     定义注解时,通常会给该注解标记两个注解，这两个是java的内置注解
 *     @Retention用来标注保留级别，有三个可选项:
 *         RetentionPolicy.SOURCE      定义的注解仅保留在源代码中
 *         RetentionPolicy.CLASS       定义的注解保留在字节码文件中(反射不可访问)
 *         RetentionPolicy.RUNTIME     定义的注解保留在字节码文件中(可被反射机制访问)
 *         不指定@Retention时,默认级别为CLASS
 *
 *     @Target用来标注该注解可以应用在哪里
 *     使用ElementType指定位置即可
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface AutoRun {
    /*
        当注解需要附带信息时，可以在标注注解时"传参".而参数会被赋值到下面
        定义的变量(或看成方法名)上

        当存在多个参数时,使用注解时传参形式为
        @AutoRun(num = 5,age =6)

        当只有一个参数时，最好为value
    * */
    int value() default 1;
}
