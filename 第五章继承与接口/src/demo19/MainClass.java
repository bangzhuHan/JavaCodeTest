package demo19;
/*Final关键字的用法:
1.修饰类，该类不能有子类，该类的方法不能被重写,与abstract冲突(abstract必须被重写)
2.修饰方法,该方法不能被重写,与abstract冲突(abstract必须被重写)
3.修饰成员变量
4.修饰局部变量
 */
public class MainClass {
    public static void main(String[] args) {
        //对基本类型变量而言,不可改变是指地址所指的数据不可改变
        final int a=30;
        //错误写法:a=29;
        //对引用变量而言,不可改变是指其地址值不可改变
        Student student = new Student("赵丽颖");
        System.out.println(student.getName());
        System.out.println(student);
        student = new Student("王力宏");//引用型变量重新赋值，地址值改变
        System.out.println(student.getName());
        System.out.println(student);
        final Student student1=new Student("蔡徐坤");//final定义的student变量地址值不能改变
/*      错误写法:
        student1=new Student("周杰伦");
 */
        final Student student2=new Student("吴亦凡");//final类使用于类的变量时，对于其内部的方法无影响
        System.out.println(student2.getName());
        System.out.println(student2);
        student2.setName("Justin Bieber");
        System.out.println(student2.getName());
        System.out.println(student2);

    }
}
