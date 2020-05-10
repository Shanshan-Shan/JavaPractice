package Day28_430.密码验证合格程序;

import java.util.Scanner;

public class Main{
    public static boolean noRepeat(String s){

        return false;

    }
    public static boolean isFourKind(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {

        }
        return false;
    }
    public static void miMa(String s){
        int len = s.length();
        if(len > 8){
            if(isFourKind(s)){
                if(noRepeat(s)){
                    System.out.println("OK");
                }else{
                    System.out.println("NG");
                }
            } else{
                System.out.println("NG");
            }
        }else{
            System.out.println("NG");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            miMa(s);
        }

    }
}

