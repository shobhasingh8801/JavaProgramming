package Practice.Array;

public class PrimeElement {
	public static void main(String[] args) {
		int arr[] = {2,1,3,5,7,4,8,9};
		for(int i = 0; i <= arr.length - 1; i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	private static boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
