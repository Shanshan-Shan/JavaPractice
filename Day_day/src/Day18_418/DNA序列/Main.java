package Day18_418.DNA序列;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); //输入的基因序列
        int subLen = in.nextInt(); //子串的长度
        int len = str.length();   //DNA序列长度
        int[] count = new int[len - subLen];   //
        int index = 0; //子串下标初始位置
        for (int i = 0; i < len - subLen; i++) {
            String substr = str.substring(i,i+subLen);  //截取[i,i+sublen) 左闭右开字符串
            for (int j = 0; j < subLen; j++) {
                if(substr.charAt(j) == 'C' || substr.charAt(j) == 'G'){
                    count[i]++;
                }
            }
            if(count[index] < count[i]){
                index = i;
            }
        }
        String re = str.substring(index,index+subLen);
        System.out.println(re);
    }
}
