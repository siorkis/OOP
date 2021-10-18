package Lab3;

import java.util.HashMap;

public class Editor {
    private static final String vowelRegex = "aouiey";

    private static String eliminate_repeating(String input, String item) {
        return input.replaceAll("(" + item + ")+", item);
    }

    public static int count_sentences(String input) {
        String lower_case = input.toLowerCase();
        String st_input = lower_case.replaceAll("[.?!]+",".").replaceAll( "[!?]", ".");
        int flag = (lower_case.replaceAll("[^a-z]", "").length() > 0)? 1 : 0;

        return Math.max(st_input.replaceAll("[^.]", "").length(), flag);
    }

    public static int count_words(String input) {
        String st_input = input.toLowerCase().replaceAll("[^a-z-']", " ").strip();
        st_input = eliminate_repeating(st_input, " ");

        return (st_input.length() > 0)? st_input.split("\\s").length : 0;
    }

    public static int count_letters(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]","");
        return letters.length();
    }

    public static int count_vowels(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]", "");
        return letters.replaceAll("[^" + vowelRegex + "]", "").length();
    }

    public static int count_consonants(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]", "");
        return letters.replaceAll("[" + vowelRegex + "]", "").length();
    }

    private static HashMap<String, Integer> getWordHashMap(String input) {
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        input = eliminate_repeating(input, " ");

        HashMap<String, Integer> wordHashMap = new HashMap<>();

        String[] words = input.split("\\s");

        for(String word: words) {
            if(wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word, 1);
            }
        }

        return wordHashMap;
    }

    public static String return_longest_word(String input) {
        String sanitized_input = input.toLowerCase().replaceAll("[^a-z-']", " ").strip();
        sanitized_input = eliminate_repeating(sanitized_input, " ");

        String[] words = sanitized_input.split("\\s");

        String longest_word = "";

        for (String word: words) {
            if (word.length() > longest_word.length()) {
                longest_word = word;
            }
        }

        return longest_word;
    }

}
