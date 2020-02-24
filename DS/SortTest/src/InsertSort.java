//简单排序--直接插入排序

//关键--找插入位置
public class InsertSort {
    public static void sort(long[] arr){
        long tmp = 0;
        for (int i = 1; i < arr.length; i++) {  //从arr[1]找插入位置
            tmp = arr[i];
            int j = i;
            while (j > 0 && arr[j] >= tmp){
                arr[j] = arr[j-1]; //右移
                j--;
            }
            arr[j] = tmp; //插入位置
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
        long[] arr = {34,23,12,1,-1,5}; //-1,1,5,12,23,,34
        display(arr);
        sort(arr);
        display(arr);
    }
}
