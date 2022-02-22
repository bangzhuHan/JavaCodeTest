package demo14;
//接口实现类
public class interfaceAbstractimpl implements interfaceAbstract,MyinterfacePrivate {
    @Override
    public void method1() {
        System.out.println(" 这是第一个方法");
    }

    @Override
    public void method2() {
        System.out.println(" 这是第二个方法");
    }

    @Override
    public void method3() {
        System.out.println(" 这是第三个方法");
    }

    @Override
    public void method4() {
        System.out.println(" 这是第四个方法");
    }

    @Override
    public void method7() {
        System.out.println("重写默认方法7");
    }

    @Override
    public void method8() {
        //MyinterfacePrivate.super.method8();
        System.out.println("重写默认方法8");
    }
}
