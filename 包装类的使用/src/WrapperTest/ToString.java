package WrapperTest;

public class ToString {
    public static void main(String[] args) {
        //基本数据类型,包装类--->String类:
        // 方式1: 调用String重载的ValueOf(Xxx xxx)
        int num = 10;
        String n1 = String.valueOf(num);
        System.out.println(n1);

        // 方式2：连接运算
        boolean b = true;
        String b1 = true + "";
        System.out.println(b1);

        //String类--->基本数据类型，包装类：调用包装类的parseXxx（String s）方法
        String s1 = "123";
        //错误写法：int num = (int)s1;
        // Integer int1 = (Integer)s1;   因为基本数据类型，包装类与String类没有子父类关系，所以不能强转
        int n2 = Integer.parseInt(s1);
        System.out.println(n2);

        String s2 = "true1";
        System.out.println(Boolean.parseBoolean(s2));
    }
}
