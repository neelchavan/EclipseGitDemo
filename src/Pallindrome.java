import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = new StringBuffer(str).reverse().toString();
		if (str.equals(rev)) {
			System.out.println("Yes it is pallindrome");
		} else {
			System.out.println("No its not a pallindrome");
		}
	}

}
