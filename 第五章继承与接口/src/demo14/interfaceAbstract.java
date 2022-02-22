package demo14;

public interface interfaceAbstract {

    public abstract void  method1();
    void method2();
    public void method3();
    void method4();

    public default void method5()//默认方法
    {
        System.out.println("这是新添加的默认方法");
    }
    public static void method6(){
        System.out.println("这是接口的静态方法");
    }
    public static final int NUM=12;
}
