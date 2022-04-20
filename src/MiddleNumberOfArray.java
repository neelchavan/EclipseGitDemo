
public class MiddleNumberOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int length = arr.length;
		if (length % 2 == 0 || arr.length < 3) {
			System.out.println("Can't find the middle one");
		} else {
			int num = (length - 1) / 2;
			for (int i = 0; i <= arr.length; i++) {
				if (i == num) {
					System.out.println("Middle member of the array is: " + arr[i]);
				}
			}
		}
	}

}
