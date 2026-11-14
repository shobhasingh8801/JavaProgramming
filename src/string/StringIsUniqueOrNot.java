package string;

import java.util.*;

public class StringIsUniqueOrNot {

    public static boolean isUnique(String str) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            set.add(str.charAt(i));
        }

        return set.size() == str.length();
    }

    public static void main(String[] args) {

        String str = "Rahul";

        if (isUnique(str)) {
            System.out.println( str + " is Unique");
        } else {
            System.out.println(str + " is Not Unique");
        }
    }
}
