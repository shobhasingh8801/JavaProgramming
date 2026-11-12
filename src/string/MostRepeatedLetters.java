package string;

public class MostRepeatedLetters {

    public static void main(String[] args) {
        String s = "aaabbbbccdd";
        int count = 1;
        int max = 1;
        char maxChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                maxChar = s.charAt(i);
            }
        }
        System.out.println("Most repeated character: " + maxChar);
        System.out.println("Consecutive frequency: " + max);
    }
}