import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class SpellChecker {
    public static void main(String[] args) {
        // Create a hash set to store dictionary words
        HashSet<String> dictionary = new HashSet<>();

        // Read and populate the dictionary
        readDictionary("dictionary.txt", dictionary);

        // Read and perform spell check on the given words
        spellCheck("words.txt", dictionary);
    }

     public static void readDictionary(String dictionaryFile, HashSet<String> dictionary) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFile))) {
            String word;
            while ((word = reader.readLine()) != null) {
                dictionary.add(word.toLowerCase()); // Convert to lowercase for case-insensitive comparison
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void spellCheck(String wordsFile, HashSet<String> dictionary) {
        try (BufferedReader reader = new BufferedReader(new FileReader(wordsFile))) {
            String word;
            while ((word = reader.readLine()) != null) {
                String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!dictionary.contains(cleanedWord) && !cleanedWord.isEmpty()) {
                    System.out.println("Misspelled word: " + word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}