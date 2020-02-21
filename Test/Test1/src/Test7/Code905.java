package Test7;

//按奇偶排序数组--排序标准按奇偶
//给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
//你可以返回满足此条件的任何数组作为答案。
public class Code905 {
    public static int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 1){
            return A;
        }
        int left = 0;
        int right = A.length-1;
        while(left < right){
            if(A[left] % 2 > A[right] % 2 ) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
            if(A[left] % 2 == 0){
                //左边是偶数，left++
                left++;
            }
            if(A[right] % 2 == 1){
                right--;       //右边是奇数，right--
            }
        }
        return A;
    }
    public static void display(int[] A){
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5}; //返回 2 4 1 3 5 ,满足奇数在偶数后面即可
        display(A);
        display(sortArrayByParity(A));
    }
}
