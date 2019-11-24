//l练习链表的头插和头删

public class MyLinkedList {
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
	
	//实现链表的头插--o(1)
	public static Node pushFront(Node head, int val) {
		Node node = new Node(val);
		node.next = head;
		return node;	
	}

	//实现链表的头删--o(1)
	public static Node popFront(Node head) {
		if (head == null) {                                    //==
			throw new RuntimeException("空链表");
		}
		return head.next;
		
	}
	
	public static void main(String[] args) {
		//
		Node head = null;
     	head = pushFront(head,0);  //实现链表的头插
		head = pushFront(head,1); 
		head = pushFront(head,2); 
		head = pushFront(head,3); 
		head = pushFront(head,4); 
		
		printLinkedList(head); // 4 3 2 1 0
		
		head = popFront(head); //头删
		head = popFront(head);
		
		printLinkedList(head); // 2 1 0
		
	}
}