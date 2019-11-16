import java.util.Arrays;

// 顺序表中存储的元素的类型是 int 类型
public class myArrayList{
	private int[] array;
	private int size;
	
	public myArrayList() {
		array = new int[10];
		size = 0;
	}
	
	// 尾插
	// 时间复杂度 O(1)
	// 空间复杂度 O(1)
	public void pushBack(int element) {
		array[size++] = element;
	}
	
	// 尾删
	// 时间复杂度 O(1)
	// 空间复杂度 O(1)
	public void popBack() {
		if (size <= 0) {
			System.out.println("空了");
			return;
		}
		array[--size] = 0;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(array, size));
	}
	
	public static void main(String[] args) {
		myArrayList list = new myArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
	
		System.out.println(list); // 30 20 10 1 2 3
	}
}
