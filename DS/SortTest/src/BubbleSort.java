//简单排序1--冒泡排序
//从后面开始比较，小的向前冒泡--交换次数多
//每一趟都把最小的排在最前面
public class BubbleSort {
    public static void sort(long[] arr){
        long tmp = 0;
        for (int i = 0; i < arr.length-1; i++) { //外层循环表示跑多少趟
            for (int j = arr.length - 1; j > i; j--) {   //循环条件
                if(arr[j] < arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
    public static void display(long[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        long[] arr = {20,34,10,8};
        display(arr);
        sort(arr);
        System.out.println("冒泡排序之后的数组为：");
        display(arr);
    }
}
