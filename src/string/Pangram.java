package string;

import java.util.*;

public class Pangram {

    public static boolean isPangram(String str1) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {

            set.add(str1.charAt(i));
        }

        return set.size() == 26;
    }

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over a lazy dog";
        String str1 = str.trim().replaceAll("\\s", "").toLowerCase();

        if (isPangram(str1)) {
            System.out.println(str + " is pangram");
        } else {
            System.out.println(str + " is Not pangram");
        }
    }
}
