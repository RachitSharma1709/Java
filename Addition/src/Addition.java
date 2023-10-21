import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Addition {
    public static void main(String[] args) {
Scanner A= new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("1.)");
        int first = A.nextInt();
        System.out.println("2.)");
        int second = A.nextInt();

        // add two numbers
        int sum = first + second;
        System.out.println(first + " + " + second + " = "  + sum);

    }
}