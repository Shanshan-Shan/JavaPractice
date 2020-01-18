//键盘输入一个字符串，并且统计其中各种字符出现的次数。
//种类有：大写字母、小写字母、数字、其他

import java.util.Scanner;

//思路：1.Scanner
//      2.字符串转换为数组
//      3.遍历，计数
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            //可以接收一下当前单个字符
            char ch = array[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNum++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母的个数为：" + countUpper);
        System.out.println("小写字母的个数为：" + countLower);
        System.out.println("数字的个数为：" + countNum);
        System.out.println("其他的个数为：" + countOther);
    }
}
