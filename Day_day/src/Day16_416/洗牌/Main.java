package Day16_416.洗牌;
import java.util.ArrayList;
import java.util.Scanner;
//    输入描述:
//    第一行一个数T(T ≤ 100)，表示数据组数。对于每组数据，第一行两个数n,k(1 ≤ n,k ≤ 100)，接
//    下来一行有2n个数a1,a2,...,a2n(1 ≤ ai ≤ 1000000000)。表示原始牌组从上到下的序列。
//    输出描述:对于每组数据，输出一行，最终的序列。数字之间用空格隔开，不要在行末输出多余的空格。
//    输入例子:
//    3
//    3 1
//    1 2 3 4 5 6
//    3 2
//    1 2 3 4 5 6
//    2 2
//    1 1 1 1
//    输出例子:
//    1 4 2 5 3 6
//    1 5 4 3 2 6
//    1 1 1 1
//知识点：用到list来调换数组中元素顺序并暂存，最后在挪到原数组中。
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[2*n];

            for (int i = 0; i < arr.length; i++) { //2n个数
                arr[i] = in.nextInt();
            }
            //反转k次
            for (int i = 0; i < k; i++) {
                getList(arr,arr.length);
            }
            for (int i = 0; i < arr.length-1; i++) { //打印出来 先处理前n-1
                System.out.print(arr[i] + " ");//不要在行末输出多余的空格
            }
            System.out.println(arr[arr.length - 1]);
            T--;
        }
    }
    public static void getList(int[] arr,int len){ //用list来调换数组中元素顺序并暂存，最后在挪到原数组中
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len/2; i++) {
            list.add(arr[i]);
            list.add(arr[i + len/2]);
        }
        for (int i = 0; i < len; i++) { //排序之后重新放回数组
            arr[i] = list.get(i);
        }
    }
}