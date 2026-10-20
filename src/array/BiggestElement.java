package array;

public class BiggestElement {
	public static void main(String[] args) {
		int a[] = { 30, 10, 40, 20 };
		int big = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > big) {
				big = a[i];
			}
		}
		System.out.println(big);
	}
}
