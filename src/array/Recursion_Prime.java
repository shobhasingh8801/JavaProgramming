
package array;

public class Recursion_Prime {
	public static void main(String[] args) {
		m1(11);
	}

	public static void m1(int n) {
		if (n <= 1) {
			System.out.println("Not Prime");
			return;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}

		System.out.println("Prime");
	}
}
