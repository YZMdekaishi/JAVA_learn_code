public class Tax_calculate {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Salary(200),
                new Royal(300)
        };
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes){
        double sum = 0;
        for(Income income : incomes) {
            sum += income.getTax();
        }
        return sum;
    }
}
abstract class Income{
    protected double income;
    public Income(int income){
        this.income = income;
    }
    abstract double getTax();
}

class Salary extends Income{
    public Salary(int income){
        super(income);
    }
    @Override
    public double getTax(){
        return income * 0.1;
    }
}
class Royal extends Income{
    public Royal(int income){
        super(income);
    }
    @Override
    public double getTax(){
        return income * 0.1;
    }
}