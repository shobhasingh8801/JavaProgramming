package array;

public class Recursion_CountDigits {
	public static void main(String[] args) {
		m1(12, 0);
		
	}

	public static void m1(int n, int count) {
		if (n == 0) {
			System.out.println(count);
			return;
		}

		m1(n / 10, count + 1);
	}
}
