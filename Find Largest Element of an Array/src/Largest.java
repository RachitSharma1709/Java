import java.util.Scanner;
public class Largest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numArray = new double[10];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numArray[i] = scanner.nextInt();
        }
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}