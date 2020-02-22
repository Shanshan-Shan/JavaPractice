//简单排序2--选择排序
//每一趟都把K指向最小值
//最后再把最小值和左边交换--交换次数比冒泡少，比冒泡效率高一点
public class SelectionSort {
    public static void sort(long[] arr){
        int k = 0;
        long tmp = 0;
        for (int i = 0; i < arr.length-1; i++) { //遍历每一趟
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[k]){
                    k = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
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
        long[] arr = {1,3,-2,8,-5}; //最后输出[-5,-2,1,3,8]
        display(arr);
        sort(arr);
        System.out.println("选择排序之后的数组为：");
        display(arr);
    }
}
