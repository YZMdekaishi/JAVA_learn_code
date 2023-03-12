public class construtor {
    public static void main(String[] args){

    }
}
class Employee{
    private String name;
    private char gender;
    private int age;
    private String position;
    private double salary;
    public Employee(double salary, String position){
        this.salary = salary;
        this.position = position;
    }

    public Employee(String name , char gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name, char gender, int age,
                    String position, double salary){
        this(name, gender, age);
        this.position = position;
        this.salary = salary;
    }//总结：要想复用构造器必须先写属性少的构造器
    //并且复用构造器只能用一次
}
