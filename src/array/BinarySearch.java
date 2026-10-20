package array;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {10,25,30,50,80,85,100};
		int key = 85;
		int index = bs(arr, key);
		System.out.println(index);
	}

	private static int bs(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right)/2;
		while(left < right) {
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				left = mid + 1;
			} else if(key < arr[mid]) {
				right = mid - 1;
			}
			mid = (left + right)/2;
		}
		return -1;
	}
	
}
