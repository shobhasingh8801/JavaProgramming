package array;

public class StrongElement{
	public static void main(String[] args) {
		int count = 0;
		int arr[] = {2,3,4,5,6,9,145,12,13};
		for(int i = 0; i <= arr.length - 1; i++) {
			if(isStrong(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean isStrong(int n) {
		int sum = 0;
		int org = n;
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
		return(fact);
	}
}

