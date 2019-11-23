//实现链表的逆置
//--反转一个单链表--重要！！！60%面试考的机率
//思路：从前往后遍历不断头插

public class ReverseList{
	//定义一个链表buildLinkedListHand
	public static Node buildLinkedListHand() {  
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		// 1 2 3 4 5 6 7
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		return n1;
	}
	
	public Node reverseList(Node head) {
		Node nHead = null; //新建一个链表，nHead是第一个节点
		Node cur = head;
		
		while(cur != null) {
			Node next = cur.next; //把cur头插到 nHead 所代表的链表上
			cur.next = nHead;
			nHead = cur;
			cur = next;
		}
		return nHead;
	}
	
	//链表的打印
	public static void printLinkedList(Node head) {
		Node cur = head ;
		
		while(cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	
	//链表逆置的第二种方法
	/* public Node reverseList2(Node head) {
		if (head == null) {
			return null;
		}
		
		Node p1 = null;
		Node p2 = head;
		Node p3 = head.next;
		
		while (p2 != null) {
			p2.next = p1;
			
			p1 = p2;
			p2 = p3;
			if (p3 != null) {
				p3 = p3.next;
			}
		}
		
		return p1;
	}
	*/
	
	 public static void main(String[] args) {  
	    ReverseList List = new ReverseList();
		Node head = buildLinkedListHand();     
        printLinkedList(head);	          //按序打印每一个值 1 2 3 4 5 6 7
		
		head = List.reverseList(head);
		printLinkedList(head);	

    }  
	
}













