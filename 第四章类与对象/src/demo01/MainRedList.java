package demo01;
import java.util.ArrayList;
public class MainRedList {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);
        Member four= new Member("成员D",0);
        System.out.println("分割线-------");

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("分割线-------");

        ArrayList<Integer> redList=manager.send(50,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
