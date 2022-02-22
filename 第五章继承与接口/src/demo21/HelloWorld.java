package demo21;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int a=3,b=44,c=51;
        int max;
        if(a>b)max=a;
            else max=b;
                if(max<c) max=c;
                System.out.println(max);
        //int max2;
        max=a>b?a:b;
        max=max>c?max:c;

        System.out.println(max);
        int d=12,e=5;
        System.out.println(d/(float)e);
        Scanner scan=new Scanner(System.in);
        int f=scan.nextInt();
        System.out.println(f+1);
        
    }
}
