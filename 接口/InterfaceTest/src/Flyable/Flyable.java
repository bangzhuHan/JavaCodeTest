package Flyable;
/**
 * 接口的使用：
 * 1.使用interface定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口中的成员
 * 3.1 JDK7及以前，只能定义全局常量和抽象方法
 * 全局常量：public static final的（可省略）
 *抽象方法： public abstract的
 *
 * 3.2 JDK8:除了全局常量和抽象方法之外，还可以定义静态方法，默认方法
 *
 *4.接口中不能定义构造器，不能实例化
 *
 * 5.Java开发中，接口让类去实现（implements）
 * 如果实现类覆盖了接口中的所有的抽象方法，则此实现类可以实例化
 * 反之，此实现类仍为抽象类
 *
 * 6.java类可以实现多个接口-->弥补Java单继承的局限性
 *
 * 7.接口可以多继承


 */
public interface Flyable {
    //全局常量,public static final可省略
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    void stop();
    /*不能定义构造方法
    public Flyable(){}
    */
}
