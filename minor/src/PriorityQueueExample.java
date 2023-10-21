import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        // The highest-priority element is 1 (smallest).
        int highestPriority = minHeap.peek();
        System.out.println("Highest Priority: " + highestPriority);

        // Removing the highest-priority element (1).
        minHeap.poll();

        // Now, the highest-priority element is 2.
        highestPriority = minHeap.peek();
        System.out.println("Highest Priority after removal: " + highestPriority);
    }
}
