import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter base then Power");
        int base = scanner.nextInt(), powerRaised = scanner.nextInt();
        int result = power(base, powerRaised);

        System.out.println(base + "^" + powerRaised + "=" + result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }
}