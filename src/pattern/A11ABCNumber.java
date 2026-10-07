package pattern;

public class A11ABCNumber {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				if( i % 2 == 1) {
					System.out.print((char)(j + 64) + " ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
