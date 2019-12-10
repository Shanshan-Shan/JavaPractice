//设计循环队列--用保留一个位置的方法
public class MyCircularQueue {
    //保留一个位置
    private int[] array;
    private int front;//队头元素位置
    private int rear; //队尾元素的下一个位置

    public MyCircularQueue(int k){
        array = new int[k + 1];
        front = rear = 0;
    }

    public boolean enqueue(int val){
        //入队
        if(isFull())
            return false;
        //尾插
        array[rear++] = val;
        rear = rear % array.length;
        return true;
    }

    //入队
    public boolean dequeue(){
        //出队
        if(isEmpty()){
            return false;
        }
        front++;
        front = front % array.length;
        return true;
    }

    public int Front(){  //获取队头元素
        if(isEmpty())
            return -1;
        return array[front];
    }
    public int Rear(){    //获取队尾元素
        if(isEmpty())
            return -1;
        if(rear == 0){   //队尾元素在rear-1位置
            return array[array.length - 1];
        }
        return array[rear - 1]; //队尾元素在rear-1位置
    }
    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return (rear + 1) % array.length == front;
    }

    public static void main(String[] args) {
        MyCircularQueue mq = new MyCircularQueue(5);
        System.out.println(mq.isEmpty());
        System.out.println(mq.Front());
        mq.enqueue(1);
        mq.enqueue(3);
        mq.enqueue(5);
        mq.enqueue(5);
        System.out.println(mq.isEmpty());
        System.out.println(mq.Front());
        mq.dequeue();
        System.out.println(mq.Front());
        mq.dequeue();
        System.out.println(mq.rear);
    }
}
