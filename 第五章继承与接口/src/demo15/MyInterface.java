package demo15;
/*使用接口时应注意：
1.接口中没有静态代码块或者构造方法
2.一个类的直接父类是唯一的,但是一个类可以同时实现多个接口
3.如果实现类所实现的多个接口中存在重复的抽象方法，那么实现类只需覆盖重写一次即可
4.若实现类没有覆盖重写接口中所有的抽象方法，那么它就必须是一个抽象类
5.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类必须对冲突的默认方法进行覆盖重写
6.一个类的直接父类当中的方法和接口中的默认方法产生冲突,优先使用父类的方法
 */
public class MyInterface extends Father {
    public static void main(String[] args) {
        Interfaceimpl a = new Interfaceimpl() {
            @Override
            public void methodC() {

            }
        };
        a.methodA();
        a.methodB();
        a.method();
        Son c= new Son() {
            @Override
            public void methodA() {

            }

            @Override
            public void methodC() {

            }
        };
        c.method();
        //c.main(String args[]);
    }
}
