package string;

import java.util.HashMap;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        String s = "ram is good and raj is good";

        s = s.toLowerCase();

        String words[] = s.split(" ");

        HashMap<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            if (freq.containsKey(words[i])) {
                freq.put(words[i], freq.get(words[i]) + 1);
            } else {
                freq.put(words[i], 1);
            }
        }

        for (String word : freq.keySet()) {
            System.out.println(word + " : " + freq.get(word));
        }
    }
}