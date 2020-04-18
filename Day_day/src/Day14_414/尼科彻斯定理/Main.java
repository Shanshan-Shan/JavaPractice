package Day14_414.尼科彻斯定理;
//验证尼科彻斯定理：任何一个整数m的立方都可以写成m个连续奇数之和
//例如：1^3 = 1; 2^3 = 3+5; 3^3 = 7+9+11
import java.util.Scanner;
//归纳可以看出规律：展开式整数n从(n*n - n + 1)开始，步进2显示，共显示n个数。
public class Main {
    public static String GetSequeOddNum(int m){
        int start = m * m - m + 1;
        String s = start + "+";
        for (int i = 0; i < m-1; i++) {
            if(i < m-2){
                start += 2;
                s += start + "+";
            }
            if(i == m-2){
                start += 2;
                s += start;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int m = in.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }
}
