package Day21_422.最难的问题;
//将原字符分两部分转化，一部分F–Z，只需要将ASCII码对应减 5；
//另一部分 A–E，将ASCII 码对应加21 ，遇到空格直接跳过。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String before = in.nextLine();
            char[] arr =  before.toCharArray();//字符串转为数组
            for (int i = 0; i < arr.length; i++) {
//                if(arr[i] >= 'A' && arr[i] <= 'E'){
//                    arr[i] += 21;
//                }else {
//                    arr[i] -= 5;
//                }
                char c= arr[i];
                if('A'<=c){
                    c=(char)('E'<c?(c-5):(c+21));
                    arr[i]=c;
                }
            }
            System.out.println(new String(arr));
        }
    }
}
