package 栈;

public class MyStack {
    //底层实现是一个数组
    private long[] arr = new long[4];
    private int top = -1; //-1表示栈顶元素为空，--栈为空，因为数组第一个下标是0

    //插入数据
    public void push(int val){
        arr[++top] = val;  //++需要写在前面
    }

    //移除数据--返回栈顶元素--
    public long pop(){
        return arr[top--];
    }

    //查看数据--返回栈顶元素
    public long peek(){
        return arr[top];
    }

    //判断是否为空
    public boolean isEmpty(){
        return top == -1;
    }

    //判断是否满了
    public boolean isFull(){
        return top == arr.length-1;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
    }
}
