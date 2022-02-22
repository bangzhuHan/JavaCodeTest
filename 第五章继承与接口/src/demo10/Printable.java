package demo10;

public interface Printable {
    public static final int MAX=100;//等价写法：int max=100；
    public abstract void on();//等价写法：void on();
    public  abstract  float sum(float x,float y);
    default int max(int a,int b){
        return  a>b?a:b;
    }
    public static void f(){
        System.out.println("注意是从Java8开始的");
    }
}
