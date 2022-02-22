package Bank;

public class LanHan {
    //1.私有化构造器
    private LanHan(){};

    //2.声明当前类的对象，没有初始化
    //4.对象必须声明为static
    private static LanHan instance = null;

    //3.声明public、static返回当前类的对象的方法
    public static LanHan getInstance(){
        if(instance == null){
            instance = new LanHan();
        }
        return instance;
    }
}

class Test1{
    public static void main(String[] args) {
        LanHan l1 = LanHan.getInstance();
        LanHan l2 = LanHan.getInstance();
        System.out.println(l1 == l2);
    }

}