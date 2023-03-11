import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        HspMethod hs = new HspMethod();
        System.out.println(hs.sum1(12, 13, 15));
        System.out.println(hs.sum1(12, 13));

    }
}
class HspMethod{
    private double result = 0;
    public double sum1(double... nums){
        result = 0;
        for(int i = 0; i < nums.length; i++){
            result += nums[i];
        }
        return result;
    }
}