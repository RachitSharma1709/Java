import java.util.Scanner;

public class interval {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int low = sc.nextInt();
        System.out.println("Higher limit must be greater than lower limit");
        System.out.println("Enter the upper limit");
                int high = sc.nextInt();

       for (int i=low;i<=high;i++){
           System.out.print(i+" ");
       }
    }
}