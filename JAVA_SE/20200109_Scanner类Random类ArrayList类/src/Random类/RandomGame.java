package Random类;
//实现猜数字的小游戏
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100); //产生0~99的随机数
        Scanner sc = new Scanner(System.in);

        while(true){   //while(true)----死循环
            System.out.println("请输入猜测的数字：" );  //放到循环里面
            int guessNum = sc.nextInt();                   //放到循环里面
            if(guessNum > randomNum){
                System.out.println("猜大了！请重新猜测：");
            }else if(guessNum < randomNum){
                System.out.println("猜小了！请重新猜测：");
            }else{
                System.out.println("恭喜，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}

