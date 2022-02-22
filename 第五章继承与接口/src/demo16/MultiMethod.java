package demo16;
/*多态代码(对象的向上转型)，成员方法访问的规则:
口诀:编译看左边,运行看右边
 */
public class MultiMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();
        //父子都有的方法,优先用new的子类
        obj.method();
        //子类没有,父类独有的方法,就向上找到父类
        obj.methodFu();
    }
}
// 对象的向上转型一定是安全的
