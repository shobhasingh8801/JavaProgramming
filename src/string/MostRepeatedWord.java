package string;

import java.util.HashMap;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String s = "ram is good and raj is good and ram is good";
        s = s.toLowerCase();
        String words[] = s.split(" ");
        HashMap<String, Integer> freq = new HashMap<>();
        // Count frequency of each word
        for (int i = 0; i < words.length; i++) {

            freq.put(words[i], freq.getOrDefault(words[i], 0) + 1);
        }
        // Find most repeated word
        String maxWord = "";
        int maxCount = 0;

        for (String word : freq.keySet()) {

            if (freq.get(word) > maxCount) {

                maxCount = freq.get(word);
                maxWord = word;
            }
        }

        System.out.println("Most repeated word: " + maxWord);
        System.out.println("Frequency: " + maxCount);
    }
}