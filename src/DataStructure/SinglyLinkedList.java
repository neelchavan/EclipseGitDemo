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

	// Display length
	public void length() {
		if(head == null) {
			System.out.println(0);
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
	}

	public void addNodeAtBeginning(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public void addNodeAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		current.next = newNode;
	}

	public void addNodeAtGivenPosition(int value, int position) {
		ListNode newNode = new ListNode(value);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
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
		System.out.println("================");
		sl.addNodeAtEnd(6);
		sl.display();
		sl.length();
		System.out.println("================");
		sl.addNodeAtBeginning(3);
		sl.display();
		sl.length();
		System.out.println("================");
		sl.addNodeAtGivenPosition(22, 1);
		sl.display();
		sl.length();
	}
}
