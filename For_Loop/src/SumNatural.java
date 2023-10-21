import java.util.Scanner;

public class SumNatural {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt(), sum = 0;
        System.out.println("By for loop");
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
        //Or the other method is
        System.out.println("USING WHILE LOOP");
                int n=num, i = 1, add = 0;

                while(i <= n)
                {
                    add += i;
                    i++;
                }

                System.out.println("Sum = " + add);
            }
        }




