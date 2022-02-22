package WrapperTest;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表结束）,找出最高分,并输出学生成绩等级‘
 * 提示:数组一旦创建，长度就固定不变,所以在创建数组前就要知道它的长度.
 * 而向量类Java.util.Vector可以根据需要动态伸缩
 *
 * 创建Vector对象：Vector v = new Vector();
 * 给向量中添加元素:v.addElement(Object obj);   //obj必须为对象
 * 取出向量中的元素:Object obj = v.elementAt(0);
 * 注意第一个元素下标为0,返回值是Object类型的.
 * 计算向量长度：v.size();
 * 若与最高分相差10分内:A等；20分内：B等；
 *              30分内：C等；其他：D等
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner,用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        //2.创建Vector对象：Vector v = new Vector();相当于原来的数组
        Vector v = new Vector();

        //利用for(;;)或者while(true):给vector中添加数组
        int maxScore = 0;
        for(;;){
            System.out.println("请输入学生成绩(以负数代表输入结束):");
            int score = scanner.nextInt();
            //3.1 当输入的是负数时,跳出循环
            if(score < 0)break;
            //3.2 输入的数大于100时,提示重新输入
                else if(score > 100){
                System.out.println("数据非法,请重新输入！");
                continue;
            }//3.3添加操作： v.addElement(Object obj)
            /*
                java5.0及以前版本：
                Integer integer = new Integer(score);
                v.addElement(integer);
             */
                else v.addElement(score);// 自动装箱
            //4.获取学生成绩最大值
            if(maxScore < score)
                maxScore = score;
        }
        //5.遍历Vector,得到每个学生成绩,并与最大成绩进行比较,得到每个学生的等级
        char level = 0;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            /*
             jdk5.0以前
             Integer n = (Integer)obj;
             int s =  n.intValue();
             */
            int s = (int)obj;//自动拆箱

            if(100 - s < 10) level= 'A';
                else if(100 - s < 20) level = 'B';
                    else if(100 - s < 30) level = 'C';
                        else level = 'D';
            System.out.println("student：" + i + " score is:" + s + ", 10level is:" + level);
        }
    }
}
