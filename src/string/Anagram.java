package string;

public class Anagram {
	public static boolean isAnagramCount(String str1, String str2) {
	    str1 = str1.replaceAll("\\s+", "").toLowerCase();
	    str2 = str2.replaceAll("\\s+", "").toLowerCase();

	    if (str1.length() != str2.length()) {
	        return false;
	    }

	    int[] charCount = new int[26];

	    for (int i = 0; i < str1.length(); i++) {
	        charCount[str1.charAt(i) - 'a']++;
	        charCount[str2.charAt(i) - 'a']--;
	    }

	    for (int count : charCount) {
	        if (count != 0) {
	            return false;
	        }
	    }

	    return true;
	}
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 ="naagram";
		if(isAnagramCount(s1, s2)) {
			System.out.println(s1 + " is Anagram.");
		}
		else {
			System.out.println(s1+ " is not a Anagram.");
		}
   }
}
