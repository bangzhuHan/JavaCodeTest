package demo15;

public class Employee {
    public int number;
    public Employee(int number){
        /**Employee是一个构造方法，无类型。
         *@param是雇员号码
         */
         this.number=number;
    }
    /**getNumber是一个实例方法。
      @return方法返回一个整数，即返魂number
     */
    public int getNumber(){
        return number;
    }
}
