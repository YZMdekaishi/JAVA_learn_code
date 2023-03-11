public class Main{
    public static void main(String[] args){
        Income[] incomes = new Income[]{//注意这里并没有给Income实例
                new Salary(5000),
                new Royalty(100)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes){
        double sum = 0;
        for(Income income : incomes){
            sum += income.getTax();
        }
        return sum;
    }
}
//接口
interface Income{
    double getTax();
}

class Salary implements Income{
    private double income;//定义收入
    public Salary(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        return income * 0.1; //税率
    }
}
class Royalty implements Income{
    private double income;
    public Royalty(double income){
        this.income = income;
    }
    public double getTax(){
        return income * 0.01;//计算稿费
    }
}