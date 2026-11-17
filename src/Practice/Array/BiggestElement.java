package Practice.Array;

public class BiggestElement {
	public static void main(String[] args) {
		int arr[] = {2,5,8,9,3,4,12};
		int big = arr[0];
		for(int i = 0; i <= arr.length - 1; i++) {
			if(arr[i] > big) {
				big = arr[i];
			}
		}
		System.out.println(big);
	}
}
