package numbersystem;

public class NonPallindromeCount {
    public static void main(String[] args) {
        int count = 0;
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if (!isPallindrome(i)) {
                count++;
            }
        }
        System.out.println("Non-palindrome count = " + count);
    }
    public static boolean isPallindrome(int n) {

        int rev = 0;
        int original = n;

        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev == original;
    }
}