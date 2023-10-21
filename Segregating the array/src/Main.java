import java.util.Scanner;
//Rachit Sharma 22CSU306
public class Main {
    public static void main(String[] args) {
        System.out.println("Segregate all zeroes to left and all ones to the right ");
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the values of the array (0 or 1)");
        for (int i = 0; i < array.length; i++) {
            int value = sc.nextInt();
            if (value == 0 || value == 1) {
                array[i] = value;
            } else {
                System.out.println("Invalid entry");
                return;
            }
        }

        int[] resultArray = new int[length];
        int zeroes = 0;
        int ones = length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                resultArray[zeroes] = 0;
                zeroes++;
            } else if (array[i] == 1) {
                resultArray[ones] = 1;
                ones--;
            }
        }

        // Print the segregated array
        System.out.println("Segregated array:");
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
