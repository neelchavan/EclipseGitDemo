package DataStructure;

public class FindNodeFrmEndOfList {
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

	public void FindNodeFromTheEndOfList(int n) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while (count < n) {
			refPtr = refPtr.next;
			count++;
		}
		while (refPtr != null) {
			mainPtr = mainPtr.next;
			refPtr = refPtr.next;
		}
		System.out.println("The Node is: " + mainPtr.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNodeFrmEndOfList fl = new FindNodeFrmEndOfList();

		fl.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);
		ListNode seventh = new ListNode(70);
		ListNode eight = new ListNode(80);

		fl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;

		fl.display();
		fl.FindNodeFromTheEndOfList(7);
	}
}
