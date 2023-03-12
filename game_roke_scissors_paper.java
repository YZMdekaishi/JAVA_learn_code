import java.util.Random;
import java.util.Scanner;
public class HomeWork14 {
    public static void main(String[] args){
        Scanner my_scanner = new Scanner(System.in);
        Tom tom = new Tom();
        int mark = 1;
        while(mark == 1){
            System.out.println("游戏开始：请输入你要输入的数字\n1：代表石头 2：代表剪刀 3：代表：布");
            int num = my_scanner.nextInt();
            tom.list(num);
            System.out.println("你还要继续玩吗？\n1：玩，0：不玩");
            if(mark == 1 || mark == 0){
                mark = my_scanner.nextInt();
            }else{
                System.out.println("你的输入有误：已退出游戏");
                break;
            }
        }
    }
}
class Tom{
    private int count = 0;
    public void list(int num){
        Random random = new Random();
        int computer = 1 + random.nextInt(3);
        if(num == 1 && computer == 2){
            count++;
            System.out.println("你赢了" + "你出的是：" + num + "," + "电脑出的是" + computer);
            System.out.println("你赢的次数是"+ count);
        }else if(num == 2 && computer == 3){
            count++;
            System.out.println("你赢了" + "你出的是：" + num + "," + "电脑出的是" + computer);
            System.out.println("你赢的次数是"+ count);
        }else if(num == 3 && computer == 1){
            count++;
            System.out.println("你赢了" + "你出的是：" + num + "," + "电脑出的是" + computer);
            System.out.println("你赢的次数是"+ count);
        }else if(num == computer){
            System.out.println("平局!!" +  "你出的是：" + num + "," + "电脑出的是" + computer);
        }else{
            System.out.println("你输了 " +  "你出的是：" + num + "," + "电脑出的是" + computer);
        }
    }
}