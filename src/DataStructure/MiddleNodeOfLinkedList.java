package DataStructure;

public class MiddleNodeOfLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
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

	public void MiddleNode() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("Middle node of the list is " + slowPtr.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleNodeOfLinkedList ml = new MiddleNodeOfLinkedList();
		ml.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);
		ListNode seventh = new ListNode(70);

		ml.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		ml.display();
		ml.MiddleNode();
	}

}
