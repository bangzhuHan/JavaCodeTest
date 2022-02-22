package demo13;

public class Example4_17 {
    public static void main(String[] args) {
        Student zhang=new Student();
        Student li=new Student();
        zhang.setAge(10);
        li.setAge(24);
        //zhang.age=10;li.age=24;
        System.out.println("zhang的年龄："+zhang.getAge());
        System.out.println("li的年龄："+li.getAge());
    }
}
