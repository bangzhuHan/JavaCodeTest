package demo01;

//import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Scan{

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入你的姓名:");
            System.out.println(s.nextInt());

        }
        catch(InputMismatchException e) {
             //e.getMessage();
            e.printStackTrace();
        }

        catch (Exception e){
            //System.out.println("您输入的数据有误！");
            e.printStackTrace();
        }

        finally{
            System.out.println("必须要执行！");
        }

    }
}
