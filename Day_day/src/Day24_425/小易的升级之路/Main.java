package Day24_425.小易的升级之路;

import java.util.Scanner;

public class Main {
    //求最大公约数 gcd
    public static int max(int b, int c){
        int i;
        for (i = c; i >= 1; i--) {
            if(b % i == 0 && c % i == 0){
                break;
            }
        }
        return i;
    }
    public static int excesize(int c, int[] b){
        int d = c;
        for (int i = 0; i < b.length; i++) {
            if(b[i] <= d){
                d += b[i];
            }else if( b[i] > d){
                d += max(b[i], d);
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int re = 0;
        while(in.hasNext()){
            int n = in.nextInt(); //怪物的数量n
            int a = in.nextInt(); //小易的初始能力值
            int[] b = new int[n];
            for (int i = 0; i < n ; i++) {
                b[i] = in.nextInt();
            }
            int re = excesize(a,b);
            System.out.println(re);
        }
    }
}
