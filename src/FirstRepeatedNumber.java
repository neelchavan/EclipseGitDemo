
public class FirstRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 2, 4, 3, 3, 5 };

		int num = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			Integer x = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				Integer y = arr[j];
				if (x.equals(y)) {
					num = x;
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		System.out.println(num);
	}
}
