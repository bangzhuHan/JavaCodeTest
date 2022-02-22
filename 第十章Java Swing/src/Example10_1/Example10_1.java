package Example10_1;

import javax.swing.*;
import java.awt.*;

public class Example10_1 {
    public static void main(String[] args) {
        JFrame window1=new JFrame("第一个窗口");
        JFrame window2=new JFrame("第二个窗口");
        Container con=window1.getContentPane();
        con.setBackground(Color.blue);
        window1.setBounds(100,100,1000 ,1880);
        window2.setBounds(130,130,940,540);
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //释放当前窗口
        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //退出程序
        window1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  //什么也不做
        window2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   //隐藏当前窗口


    }
}
