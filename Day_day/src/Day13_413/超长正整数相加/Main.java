package Day13_413.超长正整数相加;

//如输入 123 12 翻转后存储321 21 相加后 531 翻转后最终结果 135
//用两个数组反向存储
//如输入 999 1 翻转后存储999 1 相加后0001 翻转后最终结果 1000
import java.util.Scanner;

public class Main {
    public static String AddLongInteger(String addend,String augend){
        //字符串转数组
        char[] c1 = addend.toCharArray();
        char[] c2 = augend.toCharArray();
        //去最大数组长度+1开辟新的数组存储结果
        int re = c1.length > c2.length ? c1.length + 1 : c2.length + 1;
        char[] a1 = new char[re];

        //c1,c2翻转存储到数组b1,b2
        char[] b1 = new char[c1.length];
        char[] b2 = new char[c2.length];

        //将输入值进行翻转存储
        for (int i = 0; i < c1.length ; i++) {
            b1[i]=c1[c1.length-1-i];
        }
        for (int i = 0; i < c2.length ; i++) {
            b2[i]=c2[c2.length-1-i];
        }

        //初始化a1数组
        for(int i=0;i<a1.length;i++){
            a1[i]='0';
        }

        //相加存储
        for (int i = 0; i < re - 1; i++) {
            int count = 0; //倒序之后的逐位相加
            //都还有数字，相加
            if(b1.length-1-i>=0 && b2.length-1-i>=0){
                count=b1[i]-'0'+b2[i]-'0'; //-'' -- 字符转数字
            }else if(b1.length-1-i>=0 && b2.length-1-i<0){
                count=b1[i]-'0';
            }else if(b1.length-1-i<0 && b2.length-1-i>=0){
                count=b2[i]-'0';
            }
            int val = a1[i] - '0' + count; //a1[i] - '0' -- > 符‘0’变数字0 //val---和
            a1[i] = (char)(val%10+'0');
            a1[i+1]+=val/10;
        }
        //讲结果反向，输出即为正确结果--判断最后一位是否为0
        while(a1[re - 1] == '0'){
            re--;
        }

        char[] a2 = new char[re];//a2存储最终正确结果
        for (int i = 0; i< re; i++) {
            a2[re-1-i] = a1[i]; ///
        }
        String str = new String(a2);
        return str;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String addend = in.next(); //加数    nextLine,输入一个，回车，输入下一个
        String augend = in.next(); //被加数  next， 输入一个，空格，输入下一个
        System.out.println(AddLongInteger(addend, augend));
    }
}
