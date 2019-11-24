//练习链表的尾插尾删
//链表的尾插尾删一定要注意分情况讨论

public class MyLinkedList2 {
	public static Node buildLinkedListManual() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
	
		return n1;
	}

	//链表的打印
	public static void printLinkedList(Node head) {
		Node cur = head ;
		
		while(cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	
	//实现链表的尾插--o(n)
	//尾插可以优化到--o(1)
	public static Node pushBack(Node head, int val) {
		Node node = new Node(val);
		if (head == null) {
			//链表中没有节点
			return node;
		}else {
			//链表至少有一个节点
			Node cur = head;   //找最后一个节点
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = node;
			return head;	
			}
	}


	//实现链表的尾删--o(n)
	//尾删优化到o(1)--利用双向链表
	//last.prev.next = null;
	//last = last.next;
	
	public static Node popBack(Node head) {
		if (head == null) {                                    //==
			throw new RuntimeException("空链表");
		}
		if (head.next == null) {
			return null;
		} else {
			Node cur = head;   //找倒数第二个节点
			while (cur.next.next != null) {
				cur = cur.next;
			}
			cur.next = null;
			return head;
		}
		
	}
	
	public static void main(String[] args) {
		Node head = null;
     	head = pushBack(head,0);  //语法：head =   ；
		head = pushBack(head,1); 
		head = pushBack(head,2); 
		head = pushBack(head,3); 
		head = pushBack(head,4); 
		printLinkedList(head); // 0 1 2 3 4 
		
		popBack(head);
		popBack(head);
		printLinkedList(head); // 0 1 2
		
		popBack(head);
		printLinkedList(head); // 0 1 
	
	}
}



