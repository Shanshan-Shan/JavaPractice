package Day11_410.个位数统计;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        int[] num = {0,0,0,0,0,0,0,0,0,0}; //0-9
        int len = N.length();

        //字符0与数字0相差48
        for (int i = 0; i < len; i++) {
            num [N.charAt(i) - 48]++;  //字符转化为数字
        }

        for (int j = 0; j < 10; j++) {
            if(num[j] != 0){
                System.out.println(j + " : " + num[j] );
            }
        }
    }
}
