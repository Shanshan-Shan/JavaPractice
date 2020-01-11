package Scanner类;

import java.util.Scanner;

//键盘输入三个int数字，然后求出其中的最大值。
public class ScannnerDemo2_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字a:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字b:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字c:");
        int c = sc.nextInt();

//        int re = 0;
//        if(a > b)
//            re = a;
//        else
//            re = b;
//
//        int max = 0;
//        if(re > c)
//            max = re;
//        else
//            max = c;
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("三个数字中的最大值为:" + max);
    }
}
