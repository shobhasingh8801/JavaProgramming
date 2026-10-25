package array;

public class Recursion_Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		m1(arr, 0);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void m1(int[] arr, int i) {
		if (i >= arr.length / 2)
			return;

		int temp = arr[i];
		arr[i] = arr[arr.length - 1 - i];
		arr[arr.length - 1 - i] = temp;

		m1(arr, i + 1);
	}
}
