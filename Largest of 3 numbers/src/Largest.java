import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("1.)");
        double n1 = A.nextInt();
        System.out.println("2.)");
        double n2 = A.nextInt();
        System.out.println("3.)");
        double n3 = A.nextInt();


        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}