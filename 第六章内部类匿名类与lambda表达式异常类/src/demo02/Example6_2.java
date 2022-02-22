package demo02;
//匿名类
//@author：xiehan
//date:2021.11.21
abstract class Speak{//抽象类Speak
    public abstract void speakHello();
}
class Student{
    void f(Speak sp){
        sp.speakHello();
    }
}
public class Example6_2 {
    public static void main(String[] args) {
        Speak speak=new Speak() {//创建匿名类
            @Override
            public void speakHello() {
                System.out.println("勇士总冠军！");
            }
        };
        speak.speakHello();
        Student st=new Student();
        //接下来向方法参数传递匿名类
        st.f(new Speak(){
            public void speakHello(){
                System.out.println("库里MVP！");
            }
        });
    }
}
