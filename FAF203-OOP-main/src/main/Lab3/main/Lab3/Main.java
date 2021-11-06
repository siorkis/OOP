package main.Lab3;

public class Main {

    public static void main(String []args) {

        String text = "We then shift our focus to notions of profit, and how a market maker can trade to maximize its own account. We explore applying our work to one of the largest and most heavily-traded markets in the world by recasting market making as an algorithmic options trading strategy. Finally, we investigate optimal market makers for fielding wagers when good priors are known, as in sports betting or insurance.";

        StringTool Test = new StringTool(text);

        System.out.println("The number of sentences: " + Test.getSentences());
        System.out.println("The number of words: " + Test.getWords());
        System.out.println("The number of letters: " + Test.getLetters());
        System.out.println("The number of vowels: " + Test.getVowels());
        System.out.println("The number of consonants: " + Test.getConsonants());
        System.out.println("The most used words: " + Test.getMostUsedWords(5));
    }

}
