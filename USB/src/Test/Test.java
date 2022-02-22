package Test;

import Computer.Computer;
import Flash.Flash;
import USB.USB;
import Printer.Printer;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1.创建接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        //2.创建接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        computer.transferData(phone);

        //4.创建接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3停止工作");
            }
        });
    }
}
