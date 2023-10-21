class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    // Insertion at a specific location
    public void insertAtLocation(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertAtBeginning(data);
        } else if (position == size) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            int count = 0;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    // Deletion at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (size == 1) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
        size--;
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (size == 1) {
            head = null;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
        }
        size--;
    }

    // Deletion at a specific location
    public void deleteAtLocation(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            deleteAtBeginning();
        } else if (position == size - 1) {
            deleteAtEnd();
        } else {
            Node temp = head;
            int count = 0;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data); // Display the head data again to indicate the circular nature.
    }

    // Get the size of the circular linked list
    public int getSize() {
        return size;
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtEnd(4);

        System.out.println("Circular Linked List:");
        list.display();

        list.insertAtLocation(5, 2);
        list.insertAtLocation(6, 0);

        System.out.println("After insertions:");
        list.display();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtLocation(2);

        System.out.println("After deletions:");
        list.display();
    }
}
