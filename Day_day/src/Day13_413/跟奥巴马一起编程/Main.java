package Day13_413.跟奥巴马一起编程;
//输入在一行中给出正方形边长N（3~20）和组成正方形的某种字符，间隔一个空格
//输出正方形，行数为列数的50%（四舍五入）
//例如：输入：10 a
//      输出：aaaaaaaaaa
//            a        a
//            a        a
//            a        a
//            aaaaaaaaaa

import java.util.Scanner;
//思路：分三部分，第一行，最后一行，中间
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //接收输入的列数
        String C = in.next(); //接收输入的字符
        //计算行数，中间的行数count
        int count = (int)Math.round((double)N/2-2);//中间的行数count

        for (int i = 1; i < N; i++) {    //处理第一行
            System.out.print(C);         //前N-1个不换行输出
        }
        System.out.println(C);//第一行最后一个字符换行

        while (count > 0){
            System.out.print(C);
            for (int i = 2; i < N; i++) {
                System.out.print(" ");
            }
            System.out.println(C);
            count--;
        }

        for (int i = 1; i <= N; i++) {    //处理最后一行
            System.out.print(C);         //前N-1个不换行输出
        }
    }
}
