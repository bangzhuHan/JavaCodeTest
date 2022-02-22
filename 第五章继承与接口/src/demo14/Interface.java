package demo14;
//接口实现类可以直接调用接口的默认方法，也能覆盖重写重写
//静态方法不能通过接口实现类的对象来调用，要通过接口名称直接调用
//接口中的成员变量：使用public static final三个关键字修饰
/*接口的内容：
1.成员变量为常量,要用public static final修饰
2.抽象方法：实现类必须覆盖所有的抽象方法，除非他是抽象类
3.默认方法：
public default 返回值类型 方法名称(参数列表) 方法体{}
4.静态方法
public static 返回值类型 方法名称(参数列表) 方法体{}
通过接口名称调用,不能通过实现类调用
5.私有方法:
普通(静态)私有方法：private （static）返回值类型 方法名称（参数列表）{方法体}
 */

public class Interface {
    public static void main(String[] args) {
        //创建类的对象的引用
        interfaceAbstract abc = new interfaceAbstractimpl();
        abc.method1();
        abc.method2();
        abc.method3();
        abc.method4();
        abc.method5();
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.method5();
        System.out.println("===================");
        MyinterfaceDefaultB b = new MyinterfaceDefaultB();
        b.method5();
        interfaceAbstract.method6();
        MyinterfacePrivate c = new interfaceAbstractimpl();
        c.method7();
        c.method8();
        MyinterfacePrivate.method10();
        MyinterfacePrivate.method11();//调用静态方法实现私有方法
        System.out.println(interfaceAbstract.NUM);
    }
}
