package Random类;
//根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        System.out.println("请输入数字n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("随机数字的范围是1~" + n);

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int a = r.nextInt(n) + 1;
            System.out.println("随机数是：" + a);
        }
    }
}
