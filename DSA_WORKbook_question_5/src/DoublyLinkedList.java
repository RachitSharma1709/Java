class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            insertAtBeginning(data);
        } else if (position >= size()) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            int currentPosition = 0;
            while (currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void deleteFromStart() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public void deleteFromEnd() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (position <= 0) {
            deleteFromStart();
        } else if (position >= size() - 1) {
            deleteFromEnd();
        } else {
            Node current = head;
            int currentPosition = 0;
            while (currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.insertAtBeginning(1);
        myList.insertAtBeginning(2);
        myList.insertAtBeginning(3);
        System.out.println("Doubly Linked List after adding elements at the start:");
        myList.display();

        myList.insertAtEnd(4);
        myList.insertAtEnd(5);
        System.out.println("Doubly Linked List after adding elements at the end:");
        myList.display();

        myList.insertAtPosition(10, 2);
        System.out.println("Doubly Linked List after inserting at position 2:");
        myList.display();

        myList.deleteFromStart();
        System.out.println("Doubly Linked List after deleting an element from the start:");
        myList.display();

        myList.deleteFromEnd();
        System.out.println("Doubly Linked List after deleting an element from the end:");
        myList.display();

        myList.deleteAtPosition(1);
        System.out.println("Doubly Linked List after deleting element at position 1:");
        myList.display();
    }
}
