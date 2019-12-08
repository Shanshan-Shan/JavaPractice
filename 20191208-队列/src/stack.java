import java.util.Arrays;
import java.util.Stack;

//顺序表实现栈
public class stack {
    private int[] array = new int[100];
    private int size = 0;

    public void push(int val){
        //尾插
        //检查容量
        if(size == array.length){
            //增容：申请空间，拷贝
            array = Arrays.copyOf(array, 2 * size);
        }
        array[size++] = val;
    }

    public void pop(){
        if(size > 0)
            size--;
    }

    public int peek(){
        return array[size - 1];
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st.size());
        System.out.println(st.empty());
        st.pop();
        System.out.println(st.peek());
    }
}
