import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String.");
        String str = scanner.nextLine();
        System.out.println("Enter The Character to Check its Frequency");
        char ch = scanner.next().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}