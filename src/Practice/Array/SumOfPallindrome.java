package Practice.Array;

public class SumOfPallindrome {
	public static void main(String[] args) {
		int arr[] = {2,11,13,121,122};
		int sum = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(isPallindrome(arr[i])) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

	private static boolean isPallindrome(int n) {
		int rev = 0; int org = n;
		while(n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev == org;
	}
}
