//数组练习

//1.二分查找；
/*
public class arrayPractice1{
	
	public static int binarySearch(int[] a,int value){
		int left=0;
		int right=a.length-1;
		while(left<=right){
			int mid=(right+left)/2;
			if(value<a[mid]){        //去左边区间找
				right=mid-1;
			}else if(value>a[mid]){  //去右边区间找
				left=mid +1;
			}else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		System.out.println(binarySearch(arr,4));
	}
	
}
*/

//2.冒泡排序，默认数组从小到大排序

import java.util.Arrays;

public class arrayPractice1{
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





