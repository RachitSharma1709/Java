import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int originalNumber = scanner.nextInt();
        scanner.close();

        int reversedNumber = 0;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Append the last digit to the reversed number
            originalNumber /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
