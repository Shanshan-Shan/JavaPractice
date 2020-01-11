package Scanner类;
import java.util.Scanner;
/*
键盘输入两个int数字，并且求出和值。
*/
public class ScannerDemo1_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("请再次输入一个整数：");
        int b = sc.nextInt();
        System.out.println("b = " + b);

        int sum = a + b;
        System.out.println("a + b = " + sum);
    }
}
