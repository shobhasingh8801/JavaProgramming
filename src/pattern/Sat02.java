package pattern;

public class Sat02 {
	public static void main(String[] args) {
//		for (int i = 1; i <= n; i++) {
//			// spaces
//			for (int j = 1; j < i; j++) {
//				System.out.print("  ");
//			}
//			// stars
//			for (int j = 1; j <= 2 * (n - i) + 1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
// Other Way :
		
		int n = 5;
		int sp = 0;
		int st = n * 2 - 1;
		for(int i =1; i <= n; i++) {
			for( int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			st = st - 2;
		}
	}
}