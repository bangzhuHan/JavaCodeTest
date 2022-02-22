package demo02;

public class UniverStudent extends Student{
    boolean isMarriage;

    UniverStudent(int number, String name, boolean b) {
        //super(number, name);//调用父类的构造方法
    }

    public boolean isMarriage() {
        return isMarriage;
    }
}
