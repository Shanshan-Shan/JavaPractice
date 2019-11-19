//实现链表的逆置--反转一个单链表
//思路：从前往后遍历不断头插

public class exe1{
	public Node reverseList(Node head) {
		Node nHead = null;
		Node cur = head;
		while(cur != null) {
			Node next = cur.next;
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
	
	public static void main(String[] args) {
		printLinkedList(exe1);
		exe1();
		
	}
}