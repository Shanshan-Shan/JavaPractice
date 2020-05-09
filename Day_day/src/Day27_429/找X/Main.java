package Day27_429.找X;

import java.util.Scanner;

public class Main {
    public static int search(int[] arr,int x){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();

        int re = search(arr,x);
        System.out.println(re);
    }

}
