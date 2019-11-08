//数组练习

//1.二分查找；

public class arrayPractice1{
	
	public static int binarySearch(int[] arr,int value){
		int left=0;
		int right=a.length-1;
		while(left<=right){
			int mid=(right+left)/2;
			if(value<arr[mid]){        //去左边区间找
				right=mid-1;
			}else if(value>arr[mid]){  //去右边区间找
				left=mid +1;
			}else
				return mid;
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};    //数组静态初始化的简化方法；习惯用此种方法
		                            //只有定义数组的同时初始化数组方可用简化形式。
									//静态初始化：指定值。动态-->指定长度。
		System.out.println(binarySearch(arr,4));
	}
	
}

