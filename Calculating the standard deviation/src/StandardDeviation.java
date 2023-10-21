import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numArray = new double[10];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numArray[i] = scanner.nextInt();
        }

        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}