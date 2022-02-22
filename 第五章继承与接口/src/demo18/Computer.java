package demo18;

public class Computer {
    public void computerOn(){
        System.out.println("电脑开机");
    }
    public void computerOff(){
        System.out.println("电脑关机");
    }



    public void useDevice(USB usb){
        usb.usbOn();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }
        usb.usbOff();
    }
}
