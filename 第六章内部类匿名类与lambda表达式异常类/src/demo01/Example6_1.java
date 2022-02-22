package demo01;

public class Example6_1 {
    public static void main(String[] args) {
        RedCowFarm farm = new RedCowFarm("皖西学院牛场");
        farm.showCowMess();
        farm.cow.speak();
        RedCowFarm.RedCow cow=new RedCowFarm.RedCow(20,30,50);
        cow.speak();
    }
}
