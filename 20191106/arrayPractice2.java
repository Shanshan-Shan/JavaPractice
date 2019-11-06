//数组练习

//2.冒泡排序，默认数组从小到大排序

import java.util.Arrays;

public class arrayPractice2{
	 public static void swap(int[] a,int i,int j){
		 int tmp=a[i];
		 a[i]=a[j];
		 a[j]=tmp;
	}
	
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for (int j = 0; j< arr.length - i -1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}	
	}		
    public static void main(String[] args)
   {
	   int[] arr = {1,3,2,5,4};
	   bubbleSort(arr);
	   System.out.println(Arrays.toString(arr));
   }
}





