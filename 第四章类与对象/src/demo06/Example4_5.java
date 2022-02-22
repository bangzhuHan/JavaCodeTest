package demo06;
//谢涵
//2021.10.30
public class Example4_5{
    public static void main(String args[]){
        Circle circle=new Circle(10);       //代码1
        System.out.println("main方法中circle的引用:"+circle);
        System.out.println("main方法中circle类的半径:"+circle.getRadius());
        Circular circular=new Circular(circle,20);   //代码2
        System.out.println("circular圆锥的bottom引用:"+circular.bottom);
        System.out.println("圆锥的半径Radius:"+circular.getBottomRadius());
        System.out.println("圆锥的体积Volume:"+circular.getVolme());
        double r=888;
        System.out.println("修改圆锥的半径："+r);
        circular.setBottomRadius(r);    //代码3
        System.out.println("圆锥的半径Radius:"+circular.getBottomRadius());
        System.out.println("圆锥的体积Volume:"+circular.getVolme());
        System.out.println("main方法中circle类的半径:"+circle.getRadius());
        System.out.println("main方法中circle的引用将发生变化");
        circle=new Circle(1000);     //代码4
        System.out.println("main方法中circle的引用:"+circle);
        System.out.println("main方法中circle类的半径:"+circle.getRadius());
        System.out.println("但不影响circular中bottom的引用:");
        System.out.println("circular圆锥的bottom引用:"+circular.bottom);
        System.out.println("圆锥的半径Radius:"+circular.getBottomRadius());
    }

}