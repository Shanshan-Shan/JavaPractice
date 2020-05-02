package Day22_423.到底买不买;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        String sell = in.nextLine();
        String buy = in.nextLine();
        int same = 0;
        int difrrent = 0;
        StringBuffer sellb = new StringBuffer(sell);
        //StringBuffer buyb = new StringBuffer(buy);
        //只需要对卖家的珠子进行字符串删除，为的是统计多余的珠子，所以买家珠子不必Buffer
        for(int i = 0;i < buy.length();i++) {
            int b = 0;
            for(int j =0;j < sellb.length();j++) {
                if(buy.charAt(i) == sellb.charAt(j)) {
                    same++;
                    b++;
                    sellb.deleteCharAt(j); //删除相等的字符
                    break;
                }
            }
            if(b == 0) {
                difrrent++;
            }
        }
        if(same == buy.length()) {
            System.out.print("Yes"+" "+ sellb.length()); //sellb.length() or sell.length - buyb.length
        }else {
            System.out.print("No"+" "+ difrrent);
        }
    }
}