package demo13;
//private :私有变量 私有方法
public class AAA {
    private int money;
    private int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        AAA exa=new AAA();
        exa.money=2000;
        int m=exa.getMoney();
        System.out.println("money="+m);
    }
}
