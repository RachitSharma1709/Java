//Rachit Sharma 22CSU306
import java.util.Scanner;

public class Workbook_question_1_Rachit_Sharma_22CSU306 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n= scanner.nextInt();

int[] ARRAY=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<=n-1;i++){
            ARRAY[i]= scanner.nextInt();
        }

        int min = ARRAY[0];
        int max = ARRAY[0];

        for (int i = 1; i < n; i++) {
            if (ARRAY[i] < min) {
                min = ARRAY[i];
            }

//Rachit Sharma 22CSU306
        }
        for (int i = 1; i < n; i++) {
            if (max < ARRAY[i]) {
                max = ARRAY[i];
            }


        }
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
        int difference=max-min;
        System.out.println("Difference:"+difference);
    }
    }