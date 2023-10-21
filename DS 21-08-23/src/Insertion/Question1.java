package Insertion;
import java.util.Scanner;
public class Question1 {
        public static void main(String[] args) {
            int[][] jaggedArray;
            jaggedArray = createJaggedArray();
            displayJaggedArray(jaggedArray);
        }

        public static int[][] createJaggedArray() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rows: ");
            int numRows = scanner.nextInt();
            int[][] jaggedArray = new int[numRows][];

            for (int i = 0; i < numRows; i++) {
                System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
                int numElements = scanner.nextInt();
                jaggedArray[i] = new int[numElements];

                System.out.println("Enter " + numElements + " elements for row " + (i + 1) + ":");
                for (int j = 0; j < numElements; j++) {
                    jaggedArray[i][j] = scanner.nextInt();
                }
            }

            return jaggedArray;
        }

        public static void displayJaggedArray(int[][] jaggedArray) {
            System.out.println("Jagged Array:");
            for (int i = 0; i < jaggedArray.length; i++) {
                System.out.print("Row " + (i + 1) + ": ");
                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


