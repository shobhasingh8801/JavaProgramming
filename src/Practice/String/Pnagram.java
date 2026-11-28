package Practice.String;

import java.util.HashSet;

public class Pnagram {
	public static void main(String[] args) {
		String  s = "The quick brown fox jumps over a lazy dog";
		s = s.trim().replaceAll("\\s","").toLowerCase();
		if(isPanagram(s))
			System.out.println("Panagram");
		else {
			System.out.println("Not");
		}
	}

	private static boolean isPanagram(String s) {
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i <= s.length() -1; i++) {
			set.add(s.charAt(i));
		}
		return set.size() == 26;
	}
}
