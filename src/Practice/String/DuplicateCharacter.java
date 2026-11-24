package Practice.String;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s = "abac";
		int freq[] = new int[128];
		for(int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			freq[ch]++;
		}
		for(int i = 0; i <= freq.length - 1; i++) {
			if(freq[i] > 1) {
				System.out.println((char)i+ " -> " +freq[i]);
			}
		}
	}
}
