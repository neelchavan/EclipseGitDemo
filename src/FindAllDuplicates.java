import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 4, 3, 3, 5, 6, 8, 9, 2, 2, 6 };

		// First Solution
		// Finds duplicates and distinct
		List<Integer> duplicateNum = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicateNum.add(arr[i]);
					break;
				}
			}
		}
		System.out.println((duplicateNum.stream().distinct().collect(Collectors.toList())));

		// Second Solution
		// Finds only distinct values
		List<Integer> distincteNum = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		System.out.println(distincteNum);
	}
}
