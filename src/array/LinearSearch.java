package array;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {10,9,20,82,7,3};
		int key = 12;
		int index = ls(arr, key);
		System.out.println(index);
	}

	private static int ls(int[] arr, int key) {
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
