package string;

public class MostRepeatedCharacterInString {

    public static void main(String[] args) {

        String s = "Programming";
        s = s.toLowerCase();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i <= s.length() - 1; i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Most repeated character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}