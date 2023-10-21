public class Swap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        swapPairs(arr);


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swapPairs(int[] arr) {

        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap elements at adjacent indexes (i and i+1)
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
