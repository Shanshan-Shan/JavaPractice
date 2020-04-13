package Day11_410.构建乘积数组;

import java.util.Arrays;

public class Main {
    public static int[] multyArr(int[] arr1){
        if(arr1 == null){
            return null;
        }
        int len = arr1.length;
        if(len < 0){
            return null;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int re = 1;
            for (int j = 0; j < len; j++) {
                if(j != i){
                    re *= arr1[j];
                }
            }
            arr[i] = re;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = Main.multyArr(arr1);

        System.out.print(Arrays.toString(arr2));//打印数组的方法--直接Arrays.toString(数组名字)
    }
}
