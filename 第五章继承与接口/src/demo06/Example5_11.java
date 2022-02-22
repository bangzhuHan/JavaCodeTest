package demo06;
import java.lang.Override;
abstract class GirlFriend{//抽象类，封装了两个行为标准
    abstract void speak();
    abstract void cooking();
}
class ChinaGirlFriend extends GirlFriend{//子类对abstract中方法的重写
    //@Override
    void speak(){
        System.out.println("你好！\n");
    }
    void cooking(){
        System.out.println("水煮鱼");
    }
}
class EnglishGirlFriend extends GirlFriend{
    //@Override
    void speak(){
        System.out.println("Hello");
    }
    void cooking(){
        System.out.println("rost beef");
    }
}
class Boy{
    GirlFriend girlfriend;
    void setGirlFriend(GirlFriend g){
        girlfriend=g;
    }
    void showGirlFriend(){
        girlfriend.speak();
        girlfriend.cooking();
    }

    public void setGirlfriend(GirlFriend g) {
    }

    /*public void setGirlfriend(GirlFriend girl) {
    }*/
}
public class Example5_11 {
    public static void main(String[] args) {
        GirlFriend g = new ChinaGirlFriend();//girl是上转型对象
        //boy.setGirlFriend(girl);
        Boy boy = new Boy();
        boy.setGirlfriend(g);
        boy.showGirlFriend();
    }
}


