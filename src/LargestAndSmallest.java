
public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 34, 76, 65, 55, 8, 7, 4, 14567 };
		int largest = arr[0];
		int smallest = arr[0];
		for (int num : arr) {
			if (num > largest) {
				largest = num;
			} else if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("largest " + largest);
		System.out.println("smallest " + smallest);
	}

}
