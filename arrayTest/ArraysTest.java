//Arrays类的使用
//Java提供的Array类的一些static修饰的方法的调用
//static修饰的方法可以直接通过类名调用

import java.util.Arrays;

public class ArraysTest{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};   //定义一个数组a
		int[] a2 = {1,2,3,4,5};  //定义另外一个数组a2
		
		//equals方法可以直接通过类名调用，判断两个数组长度元素都一样，则返回ture;
		System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a,a2));
		
		//Arrays.copyOf,复制a数组给b,7是b的长度，比a长的话后面补0
		int[] b = Arrays.copyOf(a,7);
		System.out.println("a数组和b数组是否相等：" + Arrays.equals(a,b));
		
		//Arrays.toString输出b的元素
		System.out.println("b的数组元素为：" + Arrays.toString(b));
		
		//将数组b第3（下标2）到第5（下标4）(不包括)之间元素赋值为1
		Arrays.fill(b,2,4,1);
		System.out.println("b的数组元素为：" + Arrays.toString(b));
		
		//对数组b进行排序
		Arrays.sort(b);
		System.out.println("b的数组元素为：" + Arrays.toString(b));
	}
}






