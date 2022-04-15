package DataStructure;

public class ReverseALinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		private ListNode(int data) {
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

	public ListNode reverseSinglyLinkedList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		System.out.println(previous.toString());
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseALinkedList rl = new ReverseALinkedList();

		rl.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);
		ListNode seventh = new ListNode(70);
		ListNode eight = new ListNode(80);

		rl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;

		rl.display();
		System.out.println("======================================");
		rl.reverseSinglyLinkedList();
		rl.display();
	}

}
