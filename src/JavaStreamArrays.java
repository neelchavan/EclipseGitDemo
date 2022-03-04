import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays cannot be changed
		int[] arr = { 1, 45, 23, 2, 6, 4, 87, 533, 54, 66, 4 };

		// Array List can be changed
		// how to define array list
		List<Integer> list = Arrays.asList(1, 45, 23, 2, 6, 4, 87, 533, 54, 66, 4);
		System.out.println("List: " + list);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(6);

		// print "arr"
		System.out.println("Array " + Arrays.toString(arr));

		// Use sorted method on "list" using stream.(sorts the list)
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList: " + sortedList);

		// Use filter method on "list" using stream. (returns a modified list according
		// to condition)
		List<Integer> filteredList = list.stream().filter(s -> s > 100).collect(Collectors.toList());
		System.out.println("FilteredList: " + filteredList);

		// Use map method on "list" using stream. (used to perform opertion on every
		// element of list)
		List<Integer> mappedList = list.stream().map(s -> s / 2).collect(Collectors.toList());
		System.out.println("MappedList: " + mappedList);

		// Use reduce method on "list" using stream. (reduces list to a single element)
		int reducedList = list.stream().reduce(1, (subtotal, multiplyNum) -> subtotal * multiplyNum);
		System.out.println("reducedList: " + reducedList);

		// Convert array to arrayList and perform some operations
		// Here we need to understand the diff between int(primitive) and
		// Integer(WrapperClass)int, being a primitive data type has got less
		// flexibility. We can only store the binary value of an integer in it. Since
		// Integer is a wrapper class for int data type, it gives us more flexibility in
		// storing, converting and manipulating an int data.
		Integer[] arr2 = { 2, 3, 4, 4, 6 };
		ArrayList<Integer> arrConvToList = new ArrayList<Integer>(
				Arrays.asList(arr2).stream().sorted().collect(Collectors.toList()));
		System.out.println(arrConvToList);

	}

}
