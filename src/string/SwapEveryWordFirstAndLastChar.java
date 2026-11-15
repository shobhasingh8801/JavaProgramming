package string;

public class SwapEveryWordFirstAndLastChar {
	public static void main(String[] args) {
		String s = "Ram is Good";
		String words[] = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			char ch[] = words[i].toCharArray();

			char temp = ch[0];
			ch[0] = ch[ch.length - 1];
			ch[ch.length - 1] = temp;

			System.out.print(new String(ch) + " ");
		}
	}
}
