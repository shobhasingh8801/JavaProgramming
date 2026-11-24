package Practice.String;

public class CountConsonantsAndVowels {
	public static void main(String[] args) {
//		String s = "shobha";
//		int vc = 0; int cc = 0;
//		for(int i = 0; i <= s.length() - 1; i++) {
//			char ch = s.charAt(i);
//			if(("aeiouAEIOU").indexOf(ch) != -1) {
//				vc++;
//			} else {
//				cc++;
//			}
//		}
//		System.out.println("Vowel = " +vc+ ", Consonant = " +cc);
		
		String s = "Apple";
		s = s.toLowerCase();
		int vc = 0; int cc = 0;
		for(int  i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vc++;
				} else {
					cc++;
				}
			}
		}
		System.out.println("Vowel = " +vc);
		System.out.println("Consonant = "+cc);
	}
}
