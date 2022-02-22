package Bank;

//单例设计模式详解

import org.w3c.dom.ls.LSOutput;

class Test {
    public static void main(String[] args) {


        Bank b1 = Bank.getInstance();   //对于单例设计模式而言,只有通过类的方法才能获取对象
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
    }
}

public class Bank {
    //1.私有化类的构造方法
    private Bank(){}

    //2.内部创建类的对象
    //4.要求此对象也必须为静态
    private static Bank instance = new Bank();

    //3.通过公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
