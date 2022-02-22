package demo06;
//自定义异常类,注意throw与throws关键字的区别
//@author:xiehan
//date:2021.11.21
/*\
throw关键字
作用：可以使用throw关键字在指定的方法中抛出指定的异常

使用格式：throw new Exception("异常产生的原因")；

注意：
（1）throw关键字必须写在方法内部
（2）throw关键字后边new的对象必须是Exception和Exception的子类
（3）throw关键字抛出指定的异常对象，就必须处理这个异常对象
    第一种处理方式：throw关键字后边创建的是RuntimeException或者是RuntimeException的子类，可以不处理，默认交给JVM处理（打印异常对象，中断程序）
    第二种处理方式：throw关键字后边创建的是编译异常（写代码的时候报错），此时必须处理这个异常，要么throw，要么try...catch
throws关键字
 作用：当方法内部抛出异常对象的时候，我们必须对这个异常进行处理，可以使用throws将异常对象抛出给方法的调用者，最终交给JVM，打印异常，中断程序

 使用格式：在方法声明时使用
 修饰符 返回值类型 方法名(参数列表) throws AException，BException{ }

 注意：
 （1）throws关键字必须写在方法声明处
 （2）throws关键字后面声明的对象必须是Exception和Exception对象的子类
 （3）方法内部如果需要抛出多个异常，那么throws后边必须声明多个异常，如果声明的对象具有子父类关系，那么直接声明父类异常即可
*/public class Example6_6 {

    public static void main(String[] args) {
        People wang=new People();
        People zhang=new People();
        try{
            wang.setAge(167);
            System.out.println(wang.getAge());
        }
        catch (InterException e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        try{
            zhang.setAge(67);
            System.out.println(zhang.getAge());
        }
        catch (InterException e){
            System.out.println(e.toString());
        }
    }
}
