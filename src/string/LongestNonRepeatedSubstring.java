
package string;

public class LongestNonRepeatedSubstring {

    public static void main(String[] args) {

        String s = "shobha";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (isLongest(sub)) {

                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest Non Repeated Substring: " + longest);
    }

    private static boolean isLongest(String s) {

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
