import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner A= new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("1.)");
        int first = A.nextInt();
        System.out.println("2.)");
        int second = A.nextInt();

        float product = first * second;

        System.out.println("The product is: " + product);
    }
}