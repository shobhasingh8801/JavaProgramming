package string;

import java.util.HashSet;

public class UniqueCharacterInString {

    public static void main(String[] args) {

        String s = "Shobha";
        s = s.toLowerCase();

        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i <= s.length() - 1; i++) {

            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                System.out.println(ch);
            }
        }
    }
}