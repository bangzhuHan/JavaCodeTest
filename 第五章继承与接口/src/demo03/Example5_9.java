package demo03;

public class Example5_9 {
    public static void main(String[] args) {
        People people=new People();
        Anthropoid monkey=people;//monkey是people的上转型对象
        monkey.crySpeak("I love this game");
        //monkey.n=100;//非法，因为n为people类新增的对象
        //monkey.computer(55,33); 非法，computer为子类新增方法
        System.out.println(monkey.m);//操作隐藏的m.不等同与people.m
        System.out.println(people.m);//操作子类的m
        People zhang=(People) monkey;//强制转换为子类对象
        zhang.m='T';//操作子类声明的对象m
        System.out.println(zhang.m);


    }
}
