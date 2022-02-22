package SubClass;

import CompareA.CompareA;
import SuperClass.SuperClass;

public class SubClass extends SuperClass implements CompareA  {
    @Override
    public void method2() {
        System.out.println("徽州");
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
        //无法调用接口的静态方法
        s.method2();    //默认方法被重写后再被调用
        CompareA.method1();
        //若子类和父类继承的父类和实现的接口中声明了同名同参数的方法，优先调用父类的方法-->类优先原则
        s.method3();
        // 如果实现类实现了多个接口且多个接口中定义了同名同参数的默认方法，若实现类未重写此方法，报错

    }

}
