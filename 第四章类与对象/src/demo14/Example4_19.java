package demo14;
//自动装箱与拆箱
public class Example4_19 {
    public static void main(String[] args) {
        Integer x=100,y=12;//装箱:Integer x=new Integer(100),y=new Integer(12);
        Integer m=x+y;//先拆箱再装箱：Integer m=new Integer(x.intValue()+y.intValue);
        int ok=m;//拆箱： int Ok=m.intValue;
        System.out.println(ok);
    }
}
