import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		int vowl = 0;
		int conso = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowl++;
			} else if (ch >= 'a' && ch <= 'z') {
				conso++;
			}
		}

		System.out.println(vowl);
		System.out.println(conso);

	}

}
