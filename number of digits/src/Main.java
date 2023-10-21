import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a natural number");
        double count = 0;double num = scanner.nextDouble();

        while (num >0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}