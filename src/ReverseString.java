import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine();
		System.out.println(str);
		StringBuffer rev = new StringBuffer(str);
		rev.reverse();
		System.out.println(rev);
	}
}
