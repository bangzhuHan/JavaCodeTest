package demo01;
//p161内部类
//@author:xiehan
//date:2021.11.21
public class RedCowFarm {
    static String farmName;
    RedCow cow;//内部类声明对象
    RedCowFarm(){//无参构造方法
    }
     RedCowFarm(String s){//有参构造方法
        cow=new RedCow(150,112,5000);
        farmName=s;
    }
    public void showCowMess(){
        cow.speak();
    }
    static class RedCow{//内部类的声明
        String cowName="奶牛";
        int height,weight,price;
        RedCow cow;
        RedCow(int h,int w,int p){//内部类的构造方法
            this.height=h;
            this.weight=w;
            this.price=p;
        }
        void speak(){
            System.out.println("我是"+cowName+",身高："+weight+"cm,体重："+weight+"kg,价格:"+price+"元,生活在:"+farmName);
        }
    }//内部类结束
}//外嵌类结束
