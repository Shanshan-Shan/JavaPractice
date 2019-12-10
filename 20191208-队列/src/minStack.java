import java.util.Stack;

//使用2个栈，其中一个栈作为普通栈使用，另一个只把最小的元素入栈。
//入栈：如果元素小于或等于最小元素栈顶，则入最小元素栈
//出栈：如果元素等于最小元素栈顶，则最小元素出栈
public class minStack {
    private Stack<Integer> innerStack;
    private Stack<Integer> minStack;

    public minStack() {
        innerStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x){
        innerStack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){ //minStack.isEmpty()要在前面
            minStack.push(x);
        }
    }

    public void pop(){
        int ret = innerStack.peek();
        if(innerStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        innerStack.pop();
    }

    public int peek(){
        return innerStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        minStack minst = new minStack();
        minst.push(1);
        minst.push(0);
        minst.push(5);
        minst.push(3);
        System.out.println(minst.getMin());
        minst.pop();
        System.out.println(minst.peek());
    }

}
