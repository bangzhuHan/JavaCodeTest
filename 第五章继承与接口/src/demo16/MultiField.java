package demo16;
/*多态中成员变量的使用特点：
1.访问成员变量的两种方式:
1.直接通过对象名称访问：先看等号左边是谁就优先使用,没有就向上找
2.间接通过成员方法访问：看该方法属于谁,优先用谁,没有就向上找
 */
public class MultiField {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);
        //子类没有覆盖重写就是父类方法变量
        //子类覆盖重写,就是子类方法变量
        fu.showNum();
    }
}
