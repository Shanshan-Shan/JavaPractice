//顺序表的头插/头删
//顺序表的插入

import java.util.Arrays;

public class arrayList{
	private int[] array;
	private int size;
	
	public arrayList() {
		array = new int[10];
		size = 0;
	}
	
	//头插
	public void pushFront(int element) {
		//将所有数据都后移一位
		for(int i = size; i > 0; i--) {   //i 代表的含义：空心
			array[i] = array[i-1];
		}
		array[0] = element;
		size++;
	}
	
	// 头删
	public void popFront() {
		if(size == 0) {
			System.out.println("空了");
			return;
		}
		//i:空心
		//将所有数据都前移一位
		for(int i = 0; i < size; i++) {
			array[i] = array[i+1];
		}
		array[size] = 0; //最后一位赋值为0；
		
	}
	
	
	
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(array, size));
	}
	
	public static void main(String[] args) {
		arrayList list = new arrayList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		System.out.println(list); // 3 2 1
		
		list.popFront();
		System.out.println(list); // 2 1 
		
	}
}
