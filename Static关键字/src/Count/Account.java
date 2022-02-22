package Count;

public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;     // 余额


    private static double interestRate;     //利率
    private static double minMoney = 1.0;
    private static int init = 1001;

    public Account() {
          id = init++;
    }

    public Account(String pwd, double balance) {
        this.pwd = pwd;
        this.balance = balance;
        id = init++;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}


class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("222222",20000);

        account1.setPwd("233435");
        System.out.println("用户一的id:" + account1.getId());
        System.out.println("用户二的id:" + account2.getId());
        System.out.println("用户一的密码:" + account1.getPwd() + "   " + "用户二的密码：" +account2.getPwd());
    }
}
