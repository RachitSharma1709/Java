package Insertion;

import java.util.Scanner;

public class Insertion {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int J,N;
        System.out.println( "Enter the length of the array ");
        N=scanner.nextInt();
        System.out.println("Enter the elements");
        int[] LA=new int[N];
        for (int i=0;i<LA.length;i++){
            LA[i]= scanner.nextInt();
        }

        int item,k;
        System.out.println("Enter the element to add");
        item= scanner.nextInt();
        System.out.println("Enter the position");
        k= scanner.nextInt();
J=N;
        int[] la=new int[N+2];
while(J<k){ int i=0;
        la[i]=LA[i];
    i++;
}

for (int i=k;i<N;i++ ){
    LA[i]=la[i+1];
}

    }
}
