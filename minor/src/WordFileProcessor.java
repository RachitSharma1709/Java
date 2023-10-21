import java.io.BufferedReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class WordFileProcessor {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        // Step 1: Read the file and store all words
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] lineWords = line.split("\\s+");
//                for (String word : lineWords) {
//                    words.add(word);
//                }
//            }
//            reader.close();
//        } catch (IOException e) {
//            System.err.println("Error reading the file.");
//            e.printStackTrace();
//            return;
//        }
//
//        // Step 2: Display all words
//        System.out.println("All words:");
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        // Step 3: Display words in reverse order
//        System.out.println("\nWords in reverse order:");
//        for (int i = words.size() - 1; i >= 0; i--) {
//            System.out.println(words.get(i));
//        }
//
//        // Step 4: Display plural words
//        System.out.println("\nPlural words (ending with 's'):");
//        for (String word : words) {
//            if (word.endsWith("s")) {
//                System.out.println(word);
//            }
//        }
//
//        // Step 5: Remove plural words and display the size of the updated list
//        List<String> updatedList = new ArrayList<>(words);
//        updatedList.removeIf(word -> word.endsWith("s"));
//        System.out.println("\nWords with plural words removed:");
//        for (String word : updatedList) {
//            System.out.println(word);
//        }
//        System.out.println("Size of the updated list: " + updatedList.size());
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println(arrayList);
        System.out.println("-------------------");
        arrayList.add(2, 0);
        arrayList.remove(0);


        System.out.println(arrayList);
        System.out.println("-------------------");
        arrayList.set(0, 1);
        System.out.println(arrayList);
        System.out.println("Size=" + arrayList.size());
        System.out.println("-------------------");
        System.out.println("Number at 6=" + arrayList.get(6));
        //sorting
        Collections.sort(arrayList);
        System.out.println("After sorting" + arrayList);
    }
}
