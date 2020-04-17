package Day14_414.组个最小数;
//输入十个数字0~9，每个数字之间空格隔开--next
//输出组成的最小整数，0不做首位
//考虑特殊情况，输入的全部是0，输出0
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();//读取输入的十个数字
        }
        //分两种情况--有0 && 没有0
        Arrays.sort(num); //对输入的数组排序
        //情况1：有0,则遍历数组，找到第一个不为0的数字，与第一位交换
        if (num[0] == 0)
        {
            for (int i = 1; i < num.length; i++)
            {
                if (num[i] != 0)
                { //交换位置
                    num[0] = num[i];
                    num[i] = 0;
                    break;
                }
            }
            for (int i = 0; i < num.length; i++)
            {
                System.out.print(num[i]);
            }
        }
        else{
            for (int i = 0; i < num.length; i++)
            {
                System.out.print(num[i]);
            }
        }
    }
}