//顺序表的头插/头删/插入/扩容

//考虑容量不够的情况的处理
//判断容量够不够：size + 要插入的数据 > array.length

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
	
	//下标插入，插入的时候考虑容量
	//index--要插入的位置
	public void insert(int element, int index) {
		if(index > size || index < 0) {        //要插入的位置不合法的情况
			throw new ArrayIndexOutOfBoundsException(index);
		}
		boolean r = checkCapacity(1);
		if(!r) {
			ensureCapacity();
		}
		//从index后面数据都后移一位
		for(int i = size; i > index; i--) {
			array[i] = array[i-1];
		}
		array[index] = element;
		size++;
	}
	
	public void erase(int index) {
		if(size == 0) {
			System.out.println("空的");
			return;
		}
		for(int i = index + 1; i < size; i++) {
			array[i-1] = array[i];
		}
		array[--size] = 0;
	}

	//判断容量够不够：size + 要插入的数据 > array.length
	private boolean checkCapacity(int num) {
		return size + num <= array.length;
	}
	
	//扩容
	private void ensureCapacity() {
		array = Arrays.copyOf(array, array.length * 2);
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
		System.out.println(list); // 2 1 0
		
		list.insert(100,1);        //在下标为1的位置插入100
		list.insert(100,1);  
		list.insert(100,1);  
		list.insert(100,1);  
		list.insert(100,1);  
		list.insert(100,1); 
		list.insert(100,1);  
		list.insert(100,1); 
				
		System.out.println(list);  //2 100 1 0
		System.out.println(list.array.length);
	
		
		
	}
}
