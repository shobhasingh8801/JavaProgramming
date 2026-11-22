package Practice.String;

public class CountAlphabetDigitSpecialCharacter {
	public static void main(String[] args) {
		String s = "ab@123";
		int ac = 0, dc = 0, sc = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				ac++;
			} else if(Character.isDigit(ch)) {
				dc++;
			} else {
				sc++;
			}
		}
		System.out.println("Alphabet : " +ac);
		System.out.println("Digit : " +dc);
		System.out.println("Special : " +sc);
	}
}
