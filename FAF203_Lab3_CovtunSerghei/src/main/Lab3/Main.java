package Lab3;

public class Main
{
    public static void main(String[] args) {
        String rawText = "We then shift our focus to notions of profit, and how a market maker can trade to maximize its own account. We explore applying our work to one of the largest and most heavily-traded markets in the world by recasting market making as an algorithmic options trading strategy. Finally, we investigate optimal market makers for fielding wagers when good priors are known, as in sports betting or insurance.";

        System.out.println("The longest word is: " +Lab3.Editor.return_longest_word(rawText));
        System.out.println("Nr. of sentences are: " +Lab3.Editor.count_sentences(rawText));
        System.out.println("Nr. of words are: " +Lab3.Editor.count_words(rawText));
        System.out.println("Nr. of Letters : " +Lab3.Editor.count_letters(rawText));
        System.out.println("Nr. of Vovels: " +Lab3.Editor.count_vowels(rawText));
        System.out.println("Nr. of Consones: " +Lab3.Editor.count_consonants(rawText));
    }
}