//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//
//class TreeNode {
//    String word;
//    String definition;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(String word, String definition) {
//        this.word = word;
//        this.definition = definition;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//class BinarySearchTree {
//    TreeNode root;
//
//    public BinarySearchTree() {
//        root = null;
//    }
//
//    public void insert(String word, String definition) {
//        root = insertRec(root, word, definition);
//    }
//
//    private TreeNode insertRec(TreeNode root, String word, String definition) {
//        if (root == null) {
//            root = new TreeNode(word, definition);
//            return root;
//        }
//
//        int cmp = word.compareTo(root.word);
//        if (cmp < 0) {
//            root.left = insertRec(root.left, word, definition);
//        } else if (cmp > 0) {
//            root.right = insertRec(root.right, word, definition);
//        } else {
//            // Word already exists; update the definition
//            root.definition = definition;
//        }
//
//        return root;
//    }
//
//    public String search(String word) {
//        return searchRec(root, word);
//    }
//
//    private String searchRec(TreeNode root, String word) {
//        if (root == null) {
//            return "Word not found.";
//        }
//
//        int cmp = word.compareTo(root.word);
//        if (cmp == 0) {
//            return root.definition;
//        } else if (cmp < 0) {
//            return searchRec(root.left, word);
//        } else {
//            return searchRec(root.right, word);
//        }
//    }
//
//    public List<String> getWords() {
//        List<String> words = new ArrayList<>();
//        getWordsRec(root, words);
//        return words;
//    }
//
//    private void getWordsRec(TreeNode root, List<String> words) {
//        if (root != null) {
//            getWordsRec(root.left, words);
//            words.add(root.word);
//            getWordsRec(root.right, words);
//        }
//    }
//}
//
//public class DictionaryApp {
//    public static void main(String[] args) {
//        BinarySearchTree dictionary = new BinarySearchTree();
//
//        // Sample dictionary data
//        dictionary.insert("apple", "A fruit that grows on trees.");
//        dictionary.insert("banana", "A long, curved fruit that grows in clusters.");
//        dictionary.insert("car", "A four-wheeled vehicle used for transportation.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter a word (or 'exit' to quit): ");
//            String input = scanner.nextLine().toLowerCase();
//
//            if (input.equals("exit")) {
//                break;
//            }
//
//            if (input.equals("index")) {
//                List<String> words = dictionary.getWords();
//                for (String word : words) {
//                    System.out.println(word);
//                }
//            } else {
//                String definition = dictionary.search(input);
//                System.out.println(definition);
//            }
//        }
//
//        System.out.println("Goodbye!");
//    }
//}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    String word;
    String definition;
    TreeNode left;
    TreeNode right;

    public TreeNode(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(String word, String definition) {
        root = insertRec(root, word, definition);
    }

    private TreeNode insertRec(TreeNode root, String word, String definition) {
        if (root == null) {
            root = new TreeNode(word, definition);
            return root;
        }

        int cmp = word.compareTo(root.word);
        if (cmp < 0) {
            root.left = insertRec(root.left, word, definition);
        } else if (cmp > 0) {
            root.right = insertRec(root.right, word, definition);
        } else {
            // Word already exists; update the definition
            root.definition = definition;
        }

        return root;
    }

    public String search(String word) {
        return searchRec(root, word);
    }

    private String searchRec(TreeNode root, String word) {
        if (root == null) {
            return "Word not found.";
        }

        int cmp = word.compareTo(root.word);
        if (cmp == 0) {
            return root.definition;
        } else if (cmp < 0) {
            return searchRec(root.left, word);
        } else {
            return searchRec(root.right, word);
        }
    }

    public List<String> getWords() {
        List<String> words = new ArrayList<>();
        getWordsRec(root, words);
        return words;
    }

    private void getWordsRec(TreeNode root, List<String> words) {
        if (root != null) {
            getWordsRec(root.left, words);
            words.add(root.word);
            getWordsRec(root.right, words);
        }
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        BinarySearchTree dictionary = new BinarySearchTree();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\rachi\\IdeaProjects\\Sem dsa project\\src\\dictionary.txt.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    String word = parts[0];
                    String definition = parts[1];
                    dictionary.insert(word, definition);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the dictionary file: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word (or 'exit/quit' to quit): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                break;
            }
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("index")) {
                List<String> words = dictionary.getWords();
                for (String word : words) {
                    System.out.println(word);
                }
            } else {
                String definition = dictionary.search(input);
                System.out.println(definition);
            }
        }

        System.out.println("Exiting!");
    }
}
