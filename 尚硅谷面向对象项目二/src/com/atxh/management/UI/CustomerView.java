package com.atxh.management.UI;

import com.atxh.management.bean.Customer;
import com.atxh.management.service.CustomerList;
import com.atxh.management.util.CMUtility;

/*
 *CustomerView为主模块,负责菜单的显示和处理用户操作

 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    /**
     * 显示《客户信息管理软件》界面的方法
     * @Description
     * @author: xhhhh
     */
    /**
     * 构造器
     */
    public CustomerView() {
        Customer customer = new Customer("张三",'男',30,"010-3544756743","ads@qq.com");
        customerList.addCustomer(customer);
    }

    public  void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n---------客户信息管理软件--------\n");
            System.out.println("       1添加客户");
            System.out.println("       2修改客户");
            System.out.println("       3删除客户");
            System.out.println("       4客户列表");
            System.out.println("       5退   出\n");
            System.out.println("       请选择1——5：");

            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出（Y/N）：\n");
                    char  isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer(){
        System.out.println("---------添加客户--------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        //对于readInt方法中传default参数存在疑问
        int x=0;
        int age = CMUtility.readInt(x);
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);

        boolean  isSuccess = customerList.addCustomer(customer);
        if(isSuccess)
            System.out.println("---------客户添加完成！----------");
        System.out.println("--------添加失败！--------");
    }

    /**
     *修改操作
     */
    Customer customer;
    private void modifyCustomer(){
        System.out.println("---------修改客户--------");
        int number;
        for(;;){
            System.out.println("请选择待修改客户编号(-1退出)：");
            int x=0;
             number = CMUtility.readInt(x);
            customer = customerList.getCustomer(number - 1);
            if(customer == null)
                System.out.println("无法找到指定客户!");
            else  break;
        }

        //找到了客户并修改信息
        System.out.println("姓名(" + customer.getName() + "):");
        String name = CMUtility.readString(10,customer.getName());
        System.out.println("性别(" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.println("年龄(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.println("电话(" + customer.getPhone() + "):");
        String phone = CMUtility.readString(13,customer.getPhone());
        System.out.println("邮箱(" + customer.getEmail() + "):");
        String email = CMUtility.readString(30,customer.getEmail());

        Customer newCust = new Customer(name,gender,age,phone,email);

        boolean isRepalaced = customerList.replaceCustomer(number - 1,newCust);

        if(isRepalaced)
            System.out.println("--------修改成功--------");
        else System.out.println("--------修改失败--------");
    }

    /**
     * 删除客户操作
     */
    private void deleteCustomer(){
        System.out.println("---------删除客户--------");
        int number;
        for(;;) {
            System.out.println("请输入待删除客户编号(-1退出)：");
            int x=0;
            number = CMUtility.readInt(x);

            if (number == -1) return;
            Customer customer = customerList.getCustomer(number - 1);
            if(customer == null)
                System.out.println("无法找到指定客户！");
                else break;
        }

        //找到了指定的客户
        System.out.println("确认是否删除(Y/N):");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if(isDelete == 'Y') System.out.println("--------删除完成-------");
            else System.out.println("--------删除失败--------");
        }
        else return;
    }


    /**
     * 显示客户号列表
     */
    private void listAllCustomers(){
        System.out.println("----------客户列表------------");
        int total = customerList.getTotal();
        if(total == 0) System.out.println("没有客户记录!");
            else {
                System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
                Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i+1)+"\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" +custs[i].getAge() + "\t" +custs[i].getPhone() + "\t" + custs[i].getEmail());
            }
            }



        System.out.println("----------客户列表完成---------------");

    }

    public static void main(String args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
