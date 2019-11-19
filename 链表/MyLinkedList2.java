//练习链表的尾插尾删

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
	
	//实现链表的尾插
	public static Node pushBack(Node head, int val) {
		Node node = new Node(val);
		if (head == null) {
			return node;
		}else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = head;
			return node;	
			}
	}

	//实现链表的尾删
	public static Node popBack(Node head) {
		if (head == null) {                                    //==
			throw new RuntimeException("空链表");
		}
		if (head.next == null) {
			return null;
		} else {
			Node cur = head;
			while (cur.next.next != null) {
				cur = cur.next;
			}
			cur.next = null;
			return head;
		}
		
	}
	
	public static void main(String[] args) {
		//
		Node head = null;
     	pushBack(head,0);  
		pushBack(head,1); 
		pushBack(head,2); 
		pushBack(head,3); 
		pushBack(head,4); 
		
		printLinkedList(head);
		
		popBack(head);
		popBack(head);
		
		printLinkedList(head);
		
		popBack(head);
		
		printLinkedList(head);
		
	}
}