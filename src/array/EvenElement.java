package array;

public class EvenElement {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 9, 8, 10 };
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
