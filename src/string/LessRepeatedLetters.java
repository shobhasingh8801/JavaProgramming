package string;

public class LessRepeatedLetters {
	public static void main(String[] args) {
		String s = "aaabbbaacb";
		int freq[] = new int[128];
		// Count frequency of each character
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch]++;
		}
		int min = Integer.MAX_VALUE;
		char minChar = ' ';
		// Find least repeated character
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (freq[ch] < min) {
				min = freq[ch];
				minChar = ch;
			}
		}
		System.out.println("Least repeated letter: " + minChar);
		System.out.println("Frequency: " + min);
	}
}
