package WrapperTest;

import jdk.jfr.StackTrace;

import java.beans.Transient;

/**
 * 包装类的使用
 * Java提供了8种基本数据类型对应的包装类,使得基本数据类型的变量具有类的特征
 *
 * 2：应掌握：基本数据类型、包装类、String类三者之间的转换
 */
public class IntToInteger {
    public static void main(String[] args) {
        /**
         * 基本数据类型--->包装类
         */
        int num = 10;
        Integer    n1 =  Integer.valueOf(num);
        System.out.println(n1.toString());

        Integer n =20;
        System.out.println(n);

        Float n2 = 30.00f;
        System.out.println(n2);

        Boolean b = false;
        System.out.println(b);

        /**
         * 包装类---->基本数据类型： 调用包装类的xxxValue（）
         */
        Integer n3 = 12;
        System.out.println(n3.intValue() + 1);

       /**该方法已过时
            Integer n4 = new Integer(128);
            System.out.println(n4.toString());
            System.out.println(n4.intValue());
        */

    }
}
