package array;

public class PallindromeElement {
	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 2, 11, 12, 13, 121, 122};
		for (int i = 0; i <= arr.length - 1; i++) {
			if (isPallindrome(arr[i])) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of pallindrome is = " +sum);
	}
	public static boolean isPallindrome(int n) {
		int rev = 0, org = n;
		while(n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev == org;
	}
}
