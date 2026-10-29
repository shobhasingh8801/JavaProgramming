package array;

public class nthSmallestElement {
	public static void main(String[] args) {
		int a[] = { 20, 20, 30, 20, 40, 5 };
		int small = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}
}
