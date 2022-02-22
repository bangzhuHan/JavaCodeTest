package CircleTest;

import javax.swing.plaf.metal.MetalIconFactory;

class  Text{
    public static void main(String[] args) {
        Circle c1 = new Circle(3.14);
        Circle c2 = new Circle(2.34);
        System.out.println("c1的id：" + c1.getId());
        System.out.println("c2的id：" + c2.getId());
        System.out.println("创建的圆的个数：" + Circle.getTotal());
        System.out.println("c1的面积：" + c1.findArea());
        System.out.println("c2的面积：" + c2.findArea());
    }
}
public class Circle {
    private double radius;
    private  int id;

    private  static  int total;
    private  static int init = 1001;

    public  Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        /*id = init++;
          total++;*/
        this.radius = radius;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal(){
        return total;
    }

    public  double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
