package demo01;

/**
 @author:xhNO1
 @version -1.8
 这是我的第一个文档注释，nice！
 */
public class Person {
    private int age;
    private String name;

    // 无参构造方法
    public Person() {
    }

    //有参构造方法
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override//重写equals方法，使其能够比较两个对象的具体属性
    public boolean equals(Object o) {
        if (o==null) return false;
        //if(this==null||o==null)return false;
        if (o instanceof Person) {
            Person person = (Person) o;
            boolean a = this.name.equals(person.name) && this.age == person.age;
            return a;
            //else return false;
        }
        return false;
    }
}