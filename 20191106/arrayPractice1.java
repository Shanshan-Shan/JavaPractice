//数组练习

//1.二分查找；

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

