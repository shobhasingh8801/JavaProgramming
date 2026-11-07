package string;

import java.util.HashSet;

public class DuplicateCharacterInString {
	public static void main(String[] args) {

		String s = "Shobha";
		s = s.toLowerCase();

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i <= s.length() - 1; i++) {

			char ch = s.charAt(i);

			if (set.contains(ch)) {
				System.out.println(ch);
			}
			else {
				set.add(ch);
			}
		}
	}
}
