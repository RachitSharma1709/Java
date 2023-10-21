class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    LinkedList() {
        this.head = null;
    }
    public void inbeg(int data) {
        Node node1 = new Node(data);
        node1.next = head;
        head = node1;
    }
    public void inend(int data) {
        Node node1 = new Node(data);
        if (head == null) {
            head = node1;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node1;
    }
    public void inloc(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            inbeg(data);
            return;
        }
        Node node1 = new Node(data);
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        node1.next = current.next;
        current.next = node1;
    }
    public void delbeg() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next;
    }

    public void delend() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void delloc(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position or empty list. Cannot delete.");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position. Cannot delete.");
            return;
        }
        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ">");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.inbeg(10);
        list.inbeg(20);
        list.inbeg(30);
        System.out.println("After inserting at beginning ");
        list.display();
        list.inend(25);
        System.out.println("After Inserting at end");
        list.display();
        System.out.println("After Inserting at a Location");
        list.inloc(1,4);
        list.display();
        System.out.println("After deleting at the beginning");
        list.delbeg();
        list.display();
        System.out.println("After deleting at end");
        list.delend();
        list.display();
        System.out.println("Deleting at a location");
        list.delloc(2);
        list.display();
    }
}
