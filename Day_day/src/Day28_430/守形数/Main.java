package Day28_430.守形数;
import java.util.Scanner;
public class Main {
    public static void shouXing(int n){
        int m = n * n;
        if(n < 10){
            int num = m % 10;
            if(n == num){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }else{
            int num = m % 100;
            if(n == num){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            shouXing(n);
        }
    }
}
