package demo01;
/*
public boolean equals(Object o){
    return this==obj;
    }//基本数据类型比较数据,引用类型比较的是地址值
 */
public class Equals {
    public static void main(String[] args) {
        Person a=new Person(30,"王力宏");
        Person b=new Person(30,"王力宏");
        //Person b=new Person(27,"周杰伦");
        System.out.println(a.equals(b));
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        //a=b;
        //System.out.println(a.a(b));

    }

}
