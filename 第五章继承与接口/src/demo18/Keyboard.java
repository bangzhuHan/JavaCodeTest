package demo18;

public class Keyboard implements USB{
    @Override
    public void usbOn() {
        System.out.println("键盘开启");
    }

    @Override
    public void usbOff() {
        System.out.println("键盘关闭");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}
