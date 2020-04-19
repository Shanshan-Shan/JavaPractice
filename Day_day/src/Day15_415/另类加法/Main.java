package Day15_415.另类加法;

import java.util.Scanner;

//自己写一个函数，实现两个数字相加，不得用算数运算符
//思路：需要用到的位运算操作：异或（^）、与（&）、右移（<<）
//异或运算：又称不进位加法，a^b得到的结果为a与b相加，但是需要进位的地方不进位得到的结果
//与运算：找出来a和b中均为1的位置，利用右移操作来实现进位
//a+ba+b可以转换成位运算：a+b=(a^b)+(a&b<<1)，持续进行到a&b=0结束即可

//？？？底层一步步如何实现
public class Main {
    public static int addAB(int A, int B) {
        while (B != 0) {
            int a = A ^ B;
            int b = (A & B) << 1;
            A = a;
            B = b;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(addAB(A, B));
    }
}
