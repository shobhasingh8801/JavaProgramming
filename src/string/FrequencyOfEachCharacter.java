package string;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		String s = "Programming";
		s = s.toLowerCase();
		
		int freq[] = new int[256];
		for(int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			freq[ch]++;
		}
		for(int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			
			if(freq[ch] != 0) {
				System.out.println(ch + " : " + freq[ch]);
				freq[ch] = 0;
			}
		}
	}
}
