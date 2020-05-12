package Day29_508.年会抽奖;

// 不可能中奖的次数
//特殊的：n = 1，0； n = 2,1
//n = 3,2; n = 4,9(3*（2+1）)
//递归：n = 5 --> 4*(9+2)=44

//以上为分子，分母为n!
import java.util.Scanner;
public class Main {
    //得到分子
    public static float count(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        } else{
            return (n-1)*(count(n-1) + count(n-2));
        }
    }

    //得到分母
    public static float pro(int n){
        if(n == 0){
            return 1;
        }else{
            return n*pro(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int n = in.nextInt();
            float re = (count(n)/pro(n)) * 100;
            System.out.printf("%.2f",re);
            System.out.println("%");
        }
    }
}
