package demo13;
//私有变量的调用
public class Student {
    private int age;
    public void setAge(int age){
        if(age>=7&&age<=28)
            this.age=age;
    }
    public int getAge(){
        return age;
    }
}
