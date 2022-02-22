package demo18;
/*笔记本接口案例要点:
1.接口的基本使用
2.接口的转型及自动类型转换
 */
public class MainClass {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.computerOn();
        //定义鼠标作为向上转型对象
        USB usb=new Mouse();//多态
        computer.useDevice(usb);
        /*等同于
        mouse.usbOn();
        mouse.usbOff();
        */
        //Mouse向下转型,以便使用其独有方法
        //Mouse mouse=(Mouse)usb;//相当于computer.useDevice(usb);
        //mouse.click();//相当于computer.useDevice(usb);
        //computer.computerOff();
        /*USB usb1=new Keyboard();
        usb1.usbOn();
        usb1.usbOff();*/
        Keyboard keyboard=new Keyboard();
        computer.useDevice(keyboard);//正确写法，也发生了向上转型，自动类型转换
        //computer.useDevice(new Keyboard());//使用匿名对象也可以向上转型
        computer.computerOff();
        //computer.useDevice(new Keyboard());//使用匿名对象也可以向上转型
    }
}
