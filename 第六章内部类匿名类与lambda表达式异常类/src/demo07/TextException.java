package demo07;
//java中的抛出异常
//@author:xiehan
//date:2021.11.21
public class TextException {
    public static void main(String[] args) {
    /*异常处理语句语法：
    try{
        有可能存在的语句块
     }
    catch(异常类型 自定义异常对象名){
        捕获异常后要执行的语句
    }
    finally{
        不管有没有异常都要执行的语句
    }

     */
    //public static void main(String[] args) {
        try{//测试可能出现异常的代码块
            TextException text=new TextException();//使用TextException创建对象
            text.get_num(4,2);//调用get_num方法,给与相应参数,交由get_num方法判断是否有异常并进行处理
        }
        catch(Exception a){
            //捕获Exception异常,在不确定异常类型的情况下可以这么写。遇到异常后将其封装为异常对象a
            a.printStackTrace();
            //使用printStackTrace方法将异常对象a的错误信息打印
        }
    }
    public void get_num(int a,int b) throws Exception{//定义无返回值类型方法get_num,使用throws关键字修饰表示可处理抛出异常
        if(b==0){
            throw new Exception("算法异常,请检查方法参数是否有误");
            //如果条件成立, 就把异常抛给调用者,调用者处理异常
        }
        else System.out.println(a/b);
    }
}
