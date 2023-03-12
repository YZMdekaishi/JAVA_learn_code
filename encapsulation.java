public class encapsulation {
    public static void main(String[] args) {
        Account account = new Account("dddd", 50000, 965489);
        System.out.println("name:" + account.name + "\tsalary:" + account.getSalary() + "\tpassword:" + account.getPassword());
    }
}
class Account{
    String name = "";
    private double salary;
    private int password;

    public Account(String name, double salary, int password) {
        setName(name);
        setPassword(password);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else{
            this.name = "无名人";
            System.out.println("你的输入有误, 默认名字：无名人");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 20){
            this.salary = salary;
        }else{
            this.salary = 20;
            System.out.println("你的余额不足20元， 已默认余额：20");
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        if(password / 100_000 != 0){
            this.password = password;
        }else{
            this.password = 123456;
            System.out.println("你的密码不足6位，已默认给出密码：12345");
        }
    }
}