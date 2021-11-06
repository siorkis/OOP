package main.Lab3;

import java.util.*;

public class StringTool {

    public String input;

    public StringTool(String input) {
        this.input = input;
    }

    public int getSentences() {
        return input.split("[!?.:]+").length;
    }

    public int getWords() {
        return input.split("\\s+").length;
    }

    public int getLetters() {

        int count = 0;
        for (int i = 0; i < input.length(); ++i) {

            if (Character.isLetter(input.charAt(i))) count++;
        }
        return count;
    }


    public int getVowels() {

        String lowerInput = this.input.toLowerCase();

        int count = 0;

        for (int i = 0; i < lowerInput.length(); ++i) {
            if (input.charAt(i) == 'a' ||
                    input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' ||
                    input.charAt(i) == 'u' ||
                    input.charAt(i) == 'w') {
                count++;
            }
        }
        return count;
    }

    public int getConsonants() {
        return this.getLetters() - this.getVowels();
    }

    public List<String> getMostUsedWords(int nTopWords) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String word : this.input.split("\\W+")) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }

            else {
                map.put(word, 1);
            }
        }

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        Set<String> keys = reverseSortedMap.keySet();

        List<String> keys2 = new ArrayList<>(keys);

        return keys2.subList(0, nTopWords);
    }
}
