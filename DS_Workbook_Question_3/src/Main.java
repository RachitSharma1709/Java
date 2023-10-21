import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[5];
for (int i=0; i<5;i++){
    arr[i]=random.nextInt(100);
}
for (int i :arr){
    System.out.print(i+"  ");
}
int sum=0;
for(int i:arr){
    sum=sum+i;
}
int altsum=0;
        System.out.println("\nSum of all elements");
        System.out.println(sum);
for (int i=0;i<5;i+=2 ){
altsum=altsum+arr[i];
}
        System.out.println("\nSum of alternate elements:"+altsum);
       int max=arr[0];
        int secondmax=arr[0];
        for (int i :arr){
            if(i>max){
                max=i;
            }
            else {continue;}
        }
        System.out.println("\nMax:"+max);
        for (int i :arr){

                if (i > secondmax && max > i){
                    secondmax=i;

            }
            else {continue;}
        }
        System.out.println("\nSecond max:"+secondmax);    }}