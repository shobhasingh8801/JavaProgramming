package Practice.String;

public class FirstLetterToUpper {
	public static void main(String[] args) {
		String s = "rAm iS gOOd";
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		for(int i = 0; i <= ch.length - 1; i++) {
			if(i == 0 || ch[i - 1] == ' ') {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}
}
