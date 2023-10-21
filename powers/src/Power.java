import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Base:");
        int base = sc.nextInt();
        System.out.println("Enter The Exponent:");
        int exponent= sc.nextInt();
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
