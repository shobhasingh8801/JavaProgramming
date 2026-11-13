package string;

public class NonRepeatedCharacterInString {
    public static void main(String[] args) {
        String s = "Shobha";
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= s.length() - 1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(s.charAt(i));
            }
        }
    }
}