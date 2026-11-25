package Practice.String;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String s = "abac";
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
}
