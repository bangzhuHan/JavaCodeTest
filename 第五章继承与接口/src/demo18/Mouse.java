package demo18;

public class Mouse implements USB{
    @Override
    public void usbOn() {
        System.out.println("鼠标开启");
    }

    @Override
    public void usbOff() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
