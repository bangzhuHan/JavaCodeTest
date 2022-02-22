package demo02;

public class Application {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom;
        bottom=new Rectangle(22,100);
        pillar=new Pillar(bottom,58);
        System.out.println("矩形底的柱体的面积："+pillar.getVolume());
        bottom=new Circle(25);
        pillar=new Pillar(bottom,58);
        System.out.println("圆形底的柱体的面积："+pillar.getVolume());
        bottom=new Triangle(5,6);
        pillar=new Pillar(bottom,58);
        System.out.println("三角形底的柱体的面积："+pillar.getVolume());
    }
}
