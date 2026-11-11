package string;

public class LongestPallindrome {
	public static void main(String[] args) {
		String s = "abacab";
		String longest = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (isPallindrome(sub)) {
					if (sub.length() > longest.length()) {
						longest = sub;
					}
				}
			}
		}
		System.out.println("Longest Pallindrome: " + longest);
	}
	private static boolean isPallindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++; j--;
		}
		return true;
	}
}
