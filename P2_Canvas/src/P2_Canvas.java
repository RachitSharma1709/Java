import java.util.LinkedList;
import java.util.ListIterator;

public class P2_Canvas {
    public static void main(String[] args) {
        //Q1. Explain what the following code prints. Draw a picture of the linked list and the iterator position after each step.

        
            LinkedList<String> staff = new LinkedList<>();
            ListIterator<String> iterator = staff.listIterator();

        iterator.add("TOM");
            iterator.add("Diana");
            iterator.add("Harry");
            iterator = staff.listIterator();
            if(iterator.next().equals("Tom"))
            {
                iterator.remove();
            }
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }


}
    