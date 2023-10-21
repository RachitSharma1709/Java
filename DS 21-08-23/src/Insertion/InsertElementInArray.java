import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] LA = {10, 20, 30, 40, 50, 10, 110, 230, 980, 0}; // Linear array with initial values
        int N = LA.length-2; // Number of elements in the linear array
        int K = 3; // Position at which to insert the new element
        int ITEM = 25; // Element to be inserted

        System.out.println("Original Array:");
        for(int i:LA){
            System.out.print(i+" ");
        }

        int J = N;

        while (J >= K) {
            LA[J + 1] = LA[J];
            J--;
        }

        LA[K] = ITEM;
        N++;

        System.out.println("\nUpdated Array:");
        for(int i:LA){
            System.out.print(i+" ");
        }
    }

    public static void displayArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
