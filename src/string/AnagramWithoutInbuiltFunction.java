package string;

public class AnagramWithoutInbuiltFunction {
	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "listen";
		if (isAnagram(s1, s2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int freq[] = new int[26];
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch1 = s1.charAt(i);
			freq[ch1 - 97]++;
			char ch2 = s2.charAt(i);
			freq[ch2 - 97]--;
		}
		for(int i = 0; i <= freq.length - 1; i++) {
			if(freq[i] != 0)
				return false;
		}
		return true;
	}

}
