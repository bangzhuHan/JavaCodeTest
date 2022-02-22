package demo05;
//try catch语句
public class Example6_5 {
    public static void main(String args[]){
        int n=0,m=0,t=666;
        try {
            m = Integer.parseInt("88888");
            n=Integer.parseInt("ab985");  //发生异常,转向catch
            t=9999;                          //t没有机会赋值
        }
        catch(NumberFormatException e){
            System.out.println("发生异常："+e.getMessage());
            n=1233;
            //e.printStackTrace();
        }
        System.out.println("n="+n+",m="+m+",t="+t);
    }
}
