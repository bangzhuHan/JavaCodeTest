package demo14;
//私有方法的作用：作为一个共有方法解决两个默认方法之间的重复代码问题。
public interface MyinterfacePrivate {
    public default void method7(){
        System.out.println("默认方法7");
        method9();
    }
    public default void method8(){
        System.out.println("默认方法8");
        method9();
    }
    private static void method9(){
        System.out.println("aaa");
        System.out.println("cccc");
        System.out.println("ddd");
    }
    public static  void method10(){
       System.out.println("静态方法10");
       method9();
    }
    public static  void method11(){
        System.out.println("静态方法11");
        method9();
    }

}
