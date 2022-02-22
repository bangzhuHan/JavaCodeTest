package com.atxh.management.service;

import com.atxh.management.bean.Customer;

/**
   @date: 2022.1.9
   @author:xhhhh
 */
public class CustomerList {
    private Customer[] customers; //用来保存对象的数组
    private int total = 0;   //记录已保存客户对象的数量

    /**
     * 用来初始化customers数组的构造器
     * @param totalCustomer:指定数组长度
     */
    public CustomerList(int totalCustomer){

        customers = new Customer[totalCustomer];
    }

    /**
     * @Description:将指定的客户添加到数组中
     * @autho：xhhhh
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length)   return false;
        customers[total++] = customer;
        return true;
    }
    /**
     * @Descrikption:修改指定索引位置的客户信息
     * @param：index
     * @param：cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index >= total || index < 0)   return false;
        customers[index] = cust;
        return true;
    }

    /**
     * @Description：删除指定索引位置上的客户
     * @param index
     * @return true:删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total) return false;
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        //最后有数据的元素需要置空
        customers[--total] = null;
        return true;
    }

    /**
     * @Description: 返回所有的客户信息
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];    //复制的是地址值
        }
        return custs;
    }


    /**
     * @Description: 返回指定索引位置上的信息
     * @param index
     * @return null:未找到该元素
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total) return null;
        return customers[index];
    }

    /**
     * @return total:客户个数
     */
    public int getTotal(){
        return total;
    }
}
