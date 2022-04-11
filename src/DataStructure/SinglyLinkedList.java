package DataStructure;

public class SinglyLinkedList {

	// Instance Variable
	private ListNode head;

	private static class ListNode {
		// Data variable
		private int data;
		
		// Pointer variable
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void length() {
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sl = new SinglyLinkedList();
		// Assigning values to the node
		sl.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		// Giving pointer the location of the next node
		sl.head.next = second;
		second.next = third;
		third.next = fourth;

		sl.display();
		sl.length();
	}

}
