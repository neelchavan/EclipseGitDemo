
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vowl = 0;
		int consont = 0;
		String sentence = "aeiou";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println(vowels);
		for (char vowel : vowels)
			for (char letter : sentence.toLowerCase().toCharArray())
				if (letter == vowel)
					vowl++;
		System.out.println("Number of vowels in the given sentence is " + vowl);
		System.out.println("Number of consont in the given sentence is " + consont);
	}

}
