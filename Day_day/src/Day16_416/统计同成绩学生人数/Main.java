package Day16_416.统计同成绩学生人数;
import java.util.Scanner;
//输入第一行表示N个数据;第二行输入N个学生成绩;
//第三行输入一个值，给定分数，N=0时输入结束
//输出与第三行相同的元素个数
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N == 0){
            return;
        }
        int[] arr = new int[N]; //接收N个成绩
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int score = in.nextInt(); //第三行输入--给定分数
        //遍历数组，输出相同分数的个数
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == score){
                count++;
            }
        }
        System.out.println(count);
    }
}
