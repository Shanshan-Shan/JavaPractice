package Day24_425.最高分是多少;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();
            List<Integer> list = new ArrayList<>();  //集合放原本的成绩
            int result;
            for (int i = 0; i < N; i++) {
                list.add(in.nextInt());
            }
            char c;
            int A;
            int B;
            for (int i = 0; i < M; i++) {
                c = in.next().charAt(0);
                A = in.nextInt();
                B = in.nextInt();
                if(c == 'Q'){
                    if(A >= B){  //交换使得A<B
                        int tmp = A;
                        A = B;
                        B = tmp;
                    }
                    //A--B中选择最大的
                    int max = list.get(A-1); //A的成绩
                    //遍历找到最高的成绩
                    for (int j = A; j < B; j++) {
                        if(max < list.get(j)){
                            max = list.get(j);
                        }
                    }
                    result = max;
                    System.out.println(result);
                }
                if(c == 'U'){
                    list.set(A-1,B);
                }
            }
        }
    }
}
//利用集合很容易实现查找最大值和改变某个值
