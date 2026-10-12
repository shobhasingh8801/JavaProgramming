package pattern;

public class Mon07 {
    public static void main(String[] args) {
        int n = 4;
        int num = 2;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            while (count < i) {
                boolean isPrime = true;
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.printf("%3d", num);
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }
}