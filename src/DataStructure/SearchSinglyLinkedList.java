package DataStructure;

public class SearchSinglyLinkedList {

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

	public boolean searchByData(int data) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		int position = 1;
		while (current.next != null) {
			if (current.data == data) {
				System.out.println(current.data + " at position: " + position);
				return true;
			}
			position++;
			current = current.next;
		}
		return false;
	}

	public void SearchByDataAndRemove(int key) {
		ListNode current = head;
		ListNode prev = head;
		if (key == head.data) {
			head = head.next;
			current.next = null;
		}
		while (current.next != null) {
			if (current.data == key) {
				prev.next = current.next;
			}
			prev = current;
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchSinglyLinkedList sl = new SearchSinglyLinkedList();

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

		if (sl.searchByData(20)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		sl.SearchByDataAndRemove(10);
		sl.display();
	}
}
