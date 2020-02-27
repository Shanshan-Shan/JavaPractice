package 栈;

public class MyStack {
    //底层实现是一个数组
    private long[] arr;
    private int top; //-1表示栈顶元素为空，--栈为空，因为数组第一个下标是0

    //无参数构造方法
    public MyStack() {
        long[] arr = new long[10];
        top = -1;
    }
    //有参数构造方法
    public MyStack(int maxsize){
        arr = new long[maxsize];
        top = -1;

    }

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


}
