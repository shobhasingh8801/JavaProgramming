package string;

public class SmallestAndBiggestWord {
    public static void main(String[] args) {
        String s = "Java is a powerful programming language";
        String words[] = s.split(" ");
        String smallest = words[0];
        String biggest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
            if (words[i].length() > biggest.length()) {
                biggest = words[i];
            }
        }
        System.out.println("Smallest word: " + smallest);
        System.out.println("Biggest word: " + biggest);
    }
}