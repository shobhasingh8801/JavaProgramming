package numbersystem;

public class Armstrong {
	static boolean isArmstrong(int num) {
		int original = num;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum = sum + (digit*digit*digit);
			num = num / 10;
		}
		return sum == original;
	}
	public static void main(String[] args) {
		int num = 153;
		if(isArmstrong(num)) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
