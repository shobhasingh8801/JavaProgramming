package array;

public class SumOfOddElements {
	public static void main(String[] args) {
		int arr[] = {1,2,5,3,4,9};
		int sum = 0;
		for(int  i = 0; i <= arr.length-1; i++) {
			if(arr[i] % 2 != 0) {
				sum = sum + arr[i];  
			}
		}
		System.out.println(sum);
	}
}
