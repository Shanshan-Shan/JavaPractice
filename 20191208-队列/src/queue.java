//单链表实现队列--先进先出
//尾插头删的操作
//头删--o(1)--入队offer
//出队--头删  poll
class Node {
    int val;
    Node next;

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    //只有一个节点的情况
    Node(int val) {
        this(val, null);
    }
}

public class queue {
    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public void offer(int val) {
        Node newNode = new Node(val);
        newNode.val = val;
        newNode.next = null;

        //空队列
        if (front == null) {
            front = rear = newNode;
        } else {  //尾插
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
    }

    //出队列
    public void poll() {
        if (front == null) {
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null; //处理最后一个节点
        }
        size--;
    }

    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.val;
    }

    //获取队尾的元素值
    public int rear() {
        if (front == null) {
            return -1;
        }
        return rear.val;
        //rear = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        q.offer(1);
        q.offer(3);
        q.offer(5);
        q.offer(7);
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        System.out.println(q.peek());
        q.poll();
        q.poll();
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        System.out.println(q.peek());
    }
}
