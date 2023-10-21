import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}
