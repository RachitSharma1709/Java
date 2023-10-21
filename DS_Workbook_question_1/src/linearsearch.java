public class linearsearch {
    //Rachit Sharma 22CSU306
        public static void main(String[] args) {
            int[] array = { 10, 20, 30 };
            int target = 30;
            boolean containsValue = false;
            for (int num : array) {
                if (num == target) {
                    containsValue = true;
                    break;
                }
            }
           if (containsValue) {
                System.out.println("Array contains the value " + target);
            } else {
                System.out.println("Array does not contain the value " + target);            }        }}
