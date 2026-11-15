package string;

public class Test {
	public static void main(String[] args) {
		String s = "aaabbaacc";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (s.charAt(i + 1) == ch)
				count++;
			else {
				System.out.println(ch + "->" + count);
				count = 1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+ "->" +count);
	}
}
