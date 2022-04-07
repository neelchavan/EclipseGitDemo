import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Define size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter values for array by space");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			min = min + arr[i];
		}
		System.out.println(min);
		for (int i = 1; i < arr.length; i++) {
			max = max + arr[i];
		}
		System.out.println(max);
	}
}
