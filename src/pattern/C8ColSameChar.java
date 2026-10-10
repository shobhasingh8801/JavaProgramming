package pattern;

public class C8ColSameChar {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print((char)(j + 96) + " ");
			}
			System.out.println();
		}
	}
}
