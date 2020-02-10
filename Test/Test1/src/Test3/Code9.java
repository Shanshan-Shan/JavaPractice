package Test3;

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//示例 : 输入: 121  输出: true
//示例 :输入: -121  输出: false

//思路1：若x<0,false; 若x>=0, 判断x和对x从最高位取出，取出每一位，乘加结果是否相等。
//相等为回文数。
public class Code9 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int re = 0;
        int y = 0;
        int quo = x;
        while (quo != 0){
            re = quo % 10;
            y = y*10 + re;
            quo /= 10;
        }
        return y == x;
    }

    public static void main(String[] args) {
        int x = 20200202;        //true
        Code9 code9 = new Code9();
        boolean n = code9.isPalindrome(x);
        System.out.println(n);
    }
}
