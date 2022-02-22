package demo04;
//Lambda表达式适用于单接口,格式为只写参数列表和方法体的匿名方法
interface Cubic{
    double getCubic(double x);
}
class A{
    void f(Cubic cubic){
        double result=cubic.getCubic(5);
        System.out.println("result="+result);
    }
}
public class Example6_4 {
    public static void main(String[] args) {
        //未简化前
        Cubic cu=new Cubic() {
            @Override
            public double getCubic(double x) {
                return x*x*x;
            }
        };
        System.out.println(cu.getCubic(8));
        //使用lambda表达式简化后
        cu=(double x)->{
            return x*x*x;
        };
        System.out.println(cu.getCubic(16));
        A a=new A();
        a.f((double x)->{//使用Lambda表达式
            double result= x*x*x;
            System.out.println("result="+result);
            return result;
        });
    }
}
