package Example10_3;

import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame{
    JTextField text;
    JButton button;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    JRadioButton radio1,radio2;
    ButtonGroup group;
    JComboBox<String> comBox;
    JTextArea area;
    //JPasswordField password;
    public ComponentInWindow(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        JLabel biaoqian=new JLabel("文本框：");   //标签
        add(biaoqian);
        text=new JTextField(200);     //文本框
        add(text);
        button=new JButton("确定");
        add(button);
        checkBox1=new JCheckBox("喜欢篮球");
        checkBox2=new JCheckBox("喜欢唱歌");
        checkBox3=new JCheckBox("喜欢游泳");
        checkBox4=new JCheckBox("热爱学习");
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(checkBox4);
        group = new ButtonGroup();
        radio1 = new JRadioButton("老大");
        radio2 = new JRadioButton("老二");
        group.add(radio1);
        group.add(radio2);
        comBox = new JComboBox<String>();
        comBox.addItem("音乐公园");
        comBox.addItem("私人影院");
        comBox.addItem("海洋馆");
        add(comBox);
        area = new JTextArea(6,12);  //文本区
        add(new JScrollPane(area));
    }
}
