package demo10;
//枚举类型实例
//2021.10.31
enum Fruit{
    苹果,梨,香蕉,橘子,柚子;
}

public class Example3_10 {
    public static void main(String[] args) {
        double price = 0;
        boolean show = false;
        for (Fruit fruit : Fruit.values()) {
            switch (fruit) {
                case 梨:
                    price = 100;
                    show = true;
                    break;
                case 苹果:
                case 香蕉:
                    price = 90;
                    show = true;
                    break;
                case 柚子:
                case 橘子:
                    price = 70;
                    show = true;
                    break;
            }
            if(show)
                System.out.println("水果:"+fruit+"\n"+"价格："+price);
        }
    }
}
