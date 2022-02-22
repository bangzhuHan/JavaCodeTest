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
                    System.out.println("退出\n");
            }
        }
    }

    private void addNewCustomer(){
    }

    private void modifyCustomer(){
    }

    private void deleteCustomer(){}


    private void listAllCustomers(){}

    public static void main(String args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
