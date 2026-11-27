package Practice.String;

public class PallindromeString {
	public static void main(String[] args) {
		String s = "madam";
		if(isPallindrome(s))
			System.out.println("pal");
		else
			System.out.println("Not");
	}

	private static boolean isPallindrome(String s) {
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++; j--;
		}
		return true ;
	}

//	private static boolean isPallindrome(String s) {
//		return s.equals(new StringBuilder(s).reverse().toString());
//	}
}
