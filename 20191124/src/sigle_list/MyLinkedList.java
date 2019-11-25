package sigle_list;

public class MyLinkedList {
    //定义类的属性
    private Node head;
    private int size;

    //创建一个构造器来初始化属性
    //构造器必须与类名相同
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    //头插o(1)
    //核心：新节点->next = head;head = 新节点
    public void pushFront(int val) {
        //Node node = new Node(val,head);
        //head = node;   //要插入的节点node
        //上面两行代码可以合并为一行代码
        head = new Node(val,head);
        size++;
    }

    //头删o(1)
    //判断头节点不为空，head = head.next
    public void popFront() {
        if(head == null) {
            throw new RuntimeException("空的");
        }
        head = head.next;
        size--;
    }

    // 尾插
    // 尾插尾删需要分情况讨论
    //链表的尾插尾删一定要注意分情况讨论
    //不断开创新的结点，然后不断将新的结点的地址当做尾结点，尾结点不断后移
    //链表不为空，申请新结点，找到最后一个结点，更新最后一个结点的next为新结点，返回头结点
    public void pushBack(int val) {
        Node node = new Node(val); //创建一个新节点node
        //链表中没有节点
        if(head == null) {
            head = node;   //要尾插的是第一个节点--链表中没有节点的情况=头插
        }else {
            //链表中至少有一个节点
            Node last = head;          //从head开始找最后一个节点
            while(last.next != null){  //从head开始找最后一个节点
                last = last.next;      //从head开始找最后一个节点
            }
            last.next = node;   //最后一个节点为node,尾插完成
        }
        size++;
    }

    //尾删
    //链表的尾插尾删一定要注意分情况讨论
    //如果链表中只有一个结点，视为头删即可
    public void popBack() {
        if(size == 0){
            throw new RuntimeException("空链表");
        }
        //分情况讨论
        if(head.next ==null){     //只有一个节点
            head = null;
        }else {
            //至少有两个节点
            Node prevLast = head;               //从head遍历链表找到倒数第二个节点
            while(prevLast.next.next != null){  //从head遍历链表找到倒数第二个节点
                prevLast = prevLast.next;       //从head遍历链表找到倒数第二个节点
            }
            prevLast.next = null;   //释放最后一个结点
        }
        size--;
    }

    //打印链表
    public  void printLinkedList() {
        Node cur = head ;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
