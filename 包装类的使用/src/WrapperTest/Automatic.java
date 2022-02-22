package WrapperTest;

public class Automatic {
    public static void main(String[] args) {
        /**
         * 自动装箱与拆箱
         */
        int num = 1;
        Integer n = num;   //自动装箱：基本数据类型--->包装类

        boolean b =true;
        Boolean b1 = b;     //自动装箱

        System.out.println(b1);
        System.out.println(n);

        //自动拆箱
        int num2 = num;
        System.out.println(num2);

        System.out.println(n.toString());
        System.out.println(b1.toString());

    }
}
