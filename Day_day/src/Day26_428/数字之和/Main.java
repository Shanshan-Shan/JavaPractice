package Day26_428.数字之和;

//数字之和
import java.util.Scanner;
public class Main {
    public static int sum(int a){
        int sum = 0;
        while(a/10 != 0){
            sum += a % 10;
            a /= 10;
        }
        sum += a;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int m = (int)Math.pow(n,2);
            System.out.println(sum(n) + " " + sum(m));
        }
    }
}
