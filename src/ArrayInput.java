import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

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
		
		System.out.println(Arrays.toString(arr));
	}
}
