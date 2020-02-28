package 队列;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
        mq.insert(3);
        mq.insert(5);
        mq.insert(7);
        mq.insert(9);
        System.out.println(mq.isEmpty());  //false
        System.out.println(mq.isFull());   //true
        System.out.println(mq.peek());     //3

       while(!mq.isEmpty()){
         //  mq.remove();
           System.out.print(mq.remove() + " "); //按顺序移除
       }
    }
}
