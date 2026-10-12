package pattern;

public class Mon06 {
	public static void main(String[] args) {
		int n = 4;
		int sp = n*2-3;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; i++) {
				if(i==n && j==n) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
			sp = sp - 2;
		}
	}
}
