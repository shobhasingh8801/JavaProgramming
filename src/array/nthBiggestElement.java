package array;

public class nthBiggestElement {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 20, 40, 10 };
		int big = 0;
		for (int i = 0; i <= a.length-1; i++) {
			if (a[i] > big) {
				big = a[i];
			}
		}
		System.out.println(big);
	}
}