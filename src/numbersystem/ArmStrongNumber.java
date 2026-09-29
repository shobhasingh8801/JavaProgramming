package numbersystem;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 153;
		if(isArmstrong(n)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
	private static boolean isArmstrong(int n) {
		int count = (n + "").length();
		int sum = 0, org = n;
		while(n > 0) {
			sum += Math.pow(n%10,count);
			n = n / 10;
		}
		return sum == org;
	}
}
