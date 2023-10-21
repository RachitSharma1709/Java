import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner A= new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("Dividend:)");
        int dividend = A.nextInt();
        System.out.println("Divisor)");
        int divisor = A.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}