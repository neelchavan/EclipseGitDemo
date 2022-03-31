import java.util.Scanner;

public class MatchingChCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String sentence = "aeiaouu";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr ch");
		char ch1 = sc.next().charAt(0);
		char[] ch = { ch1 };
		for (char iteratedValues : ch)
			for (char letter : sentence.toLowerCase().toCharArray())
				if (letter == iteratedValues)
					count++;
		System.out.println("occurance of " + ch1 + " is " + count);
	}
}
