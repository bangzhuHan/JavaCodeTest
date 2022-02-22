package Computer;

import USB.USB;

public class Computer {
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体实现传输数据的细节");
        usb.stop();
    }
}
