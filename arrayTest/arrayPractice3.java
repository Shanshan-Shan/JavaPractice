//数组练习

import java.util.Arrays;

public class arrayPractice3 {
	public static void swap(int[] a, int[] b) {
		int[] t = a;
		a = b;
		b = t;
	}
	
	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 9, 7, 3, 2 };
		swap(ar1, ar2);
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
	}
}