package demo07;
//@author:xiehan
//2021.10.30

public class main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        double result= computer.getResult(1.0/4,10,12,13,14);
        System.out.println("这四个数的平均值为:"+result);
    }
}
