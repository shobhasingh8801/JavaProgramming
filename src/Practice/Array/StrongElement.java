package Practice.Array;

public class StrongElement {
	public static void main(String[] args) {
		int arr[] = {1,2,11,12,22,145};
		int count = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(isStrong(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean isStrong(int n) {
		int sum = 0; int org = n;
		while(n > 0) {
			int digit = n % 10;
			int fact = factorial(digit);
			sum = sum + fact;
			n = n / 10;
		}
		return sum == org;
	}

	private static int factorial(int digit) {
		int fact = 1;
		for(int i = 1; i <= digit; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
