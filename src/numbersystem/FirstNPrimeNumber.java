package numbersystem;

public class FirstNPrimeNumber {
//    static void printPrimeNumbers(int n) {
//        int count = 0;
//        int num = 2;
//        while (count < n) {
//            boolean isPrime = true;
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                }
//            }
//            if (isPrime) {
//                System.out.print(num + " ");
//                count++;
//            }
//            num++;
//        }
//    }
//    public static void main(String[] args) {
//        printPrimeNumbers(4);
//    }
	public static void main(String[] args) {
		int n = 4;
		int count = 0, i = 2;
		while(true) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
				if(count == n) {
					break;
				}
			}
			i++;
		}
	}
	private static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i<= n/2; i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}
}
