package Test6;
//有序数组的平方
//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
import java.util.Arrays;

public class Code977 {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
    public void display(int[] A){
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] A = {-5, -2, 1, 4};
        Code977 code977 = new Code977();
        code977.display(A);
        code977.sortedSquares(A);
        code977.display(A);
    }
}
