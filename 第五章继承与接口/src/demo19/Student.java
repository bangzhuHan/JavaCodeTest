package demo19;

public class Student {
    String name;
    public Student(){};//构造方法
    public  Student(String name){//有参构造方法
       this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
