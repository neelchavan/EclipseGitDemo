package DataStructure;

public class SinglyLinkedListDeleteOperations {

	// Delete operations on Singly Linked List.

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

	// Display length
	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
		return count;
	}

	public ListNode deleteBeginningNode() {
		if (head == null) {
			return null;
		}
		ListNode current = head;
		head = head.next;
		current.next = null;
		return current;
	}

	public ListNode deleteLastNode() {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

	public void deleteNodeAtGivenPosition(int position) {
		if (position == 1) {
			ListNode current = head;
			head = head.next;
			current.next = null;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				count++;
				previous = previous.next;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListDeleteOperations sl = new SinglyLinkedListDeleteOperations();
		sl.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);
		ListNode seventh = new ListNode(70);
		ListNode eight = new ListNode(80);

		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;

		sl.display();
		sl.length();
		System.out.println("==========================");
		sl.deleteBeginningNode();
		sl.display();
		sl.length();
		System.out.println("==========================");
		sl.deleteLastNode();
		sl.display();
		sl.length();
		System.out.println("==========================");
		sl.deleteNodeAtGivenPosition(2);
		sl.display();
		sl.length();
	}
}
