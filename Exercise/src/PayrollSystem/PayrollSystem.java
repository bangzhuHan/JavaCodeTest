package PayrollSystem;
/*
    定义PayrollSystem类，创建Employee数组并初始化，该数组存放各类员工对象的引用。
    利用循环结构遍历数组元素，输出各个对象的类型，name,number,birthday
    当键盘输入本月月份值时，若本月是某个员工的生日，还要输出增加工资信息。
 */
import Employee.Employee;
import HourlyEmployee.HourlyEmployee;
import MyDate.MyDate;
import SalariedEmployee.SalariedEmployee;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        //方式一   ：

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int bir = scanner.nextInt();


        //方式二
        /*
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);   //获取当前月份
        */
        Employee[] elem = new Employee[3];
        elem[0] = new SalariedEmployee("徐凤年",1001,new MyDate(2001,2,22),18000);
        elem[1] = new HourlyEmployee("范闲",1002,new MyDate(2002,11,22),65,240);
        elem[2] = new SalariedEmployee("五竹",1202,new MyDate(899,1,4),150000);

        for (int i = 0; i < elem.length; i++) {
            System.out.println(elem[i]);
            double salary = elem[i].earnings();
            if(bir == elem[i].getBirthday().getMonth()){
                salary += 100;
                System.out.println("生日快乐!工资增加100元。");
            }
            System.out.println("当月工资：" + salary);
        }

    }

}
