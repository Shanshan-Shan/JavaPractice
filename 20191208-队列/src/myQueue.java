//用两个栈实现队列

import java.util.Stack;

public class myQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public myQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>(); //出栈
    }

    public void push(int val){
        stack1.push(val);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            int sz = stack1.size();
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

   public static void main(String[] args) {
        myQueue myqueue = new myQueue();
        myqueue.push(1);
        myqueue.push(2);
        myqueue.push(3);
        myqueue.push(4);

        System.out.println(myqueue.peek());
        myqueue.push(5);
        System.out.println(myqueue.empty());
    }
}

