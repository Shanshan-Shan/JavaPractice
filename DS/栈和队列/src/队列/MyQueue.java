package 队列;
//实现队列类
public class MyQueue {
    private long[] arr;//底层使用数组
    private int n; //有效元素个数
    private int front; //队头
    private int end;   //队尾

    //无参构造器
    public MyQueue() {
        arr = new long[10];
        n = 0;
        front = 0;
        end = -1;
    }

    //有参构造器--参数为数组的大小
    public MyQueue(int maxsize){
        arr = new long[maxsize];
        n = 0;
        front = 0;
        end = -1;
    }

    //添加数据--队尾添加
    public void insert(long val){
        arr[++end] = val;
        n++;
    }
    //删除数据--队头删除
    public long remove(){
        n--;
        return arr[front++];
    }
    //查看数据--队头查看
    public long peek(){
        return arr[front];
    }
    //判断是否满了
    public boolean isFull(){
        return n == arr.length;
    }
    //判断是否为空
    public boolean isEmpty(){
        return n == 0;
    }
}

