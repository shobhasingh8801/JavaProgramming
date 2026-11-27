package Practice.String;

public class MostRepeatedCharacter {
	public static void main(String[] args) {
		String s = "abcbab";
		int maxocc = 0;
		char mostepe = s.charAt(0);
		int freq[] = new int[128];
		for(int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			freq[ch]++;
		}
		for(int i = 0; i <= freq.length - 1; i++) {
			if(freq[i] > maxocc) {
				maxocc = freq[i];
				mostepe = (char)i;
			}
		}
		System.out.println(mostepe);
	}
}
