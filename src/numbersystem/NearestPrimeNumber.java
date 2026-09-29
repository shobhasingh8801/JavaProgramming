package numbersystem;

public class NearestPrimeNumber {
//	    static void printNearestPrime(int n) {
//	        int num = n;
//	        while (true) {
//	            boolean isPrime = true;
//	            for (int i = 2; i <= num / 2; i++) {
//	                if (num % i == 0) {
//	                    isPrime = false;
//	                }
//	            }
//	            if (isPrime) {
//	                System.out.print(num);
//	                break;
//	            }
//	            num++;
//	        }
//	    }
//	    public static void main(String[] args) {
//	        printNearestPrime(10);
//	    }
	public static void main(String[] args) {
		int n = 15;
		int prev = n -1;
		int next = n + 1;
		while(true) {
			if(isPrime(prev)) {
				System.out.println(prev);
				break;
			}
			else if(isPrime(next)) {
				System.out.println(next);
				break;
			}
			prev--; next++;
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

