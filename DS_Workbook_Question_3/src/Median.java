
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> ar = new ArrayList<Student>();

        ar.add(new Student(111, "Mayank", "Delhi"));
        ar.add(new Student(131, "Anshul", "Jaipur"));
        ar.add(new Student(121, "Solanki", "Agra"));
        ar.add(new Student(101, "Aggarwal", "Goa"));

        System.out.println("Unsorted List ");

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        while (true) {
            System.out.println("Options:");
            System.out.println("1.Sort by Roll no. ");
            System.out.println("2.Sort by Name  ");
            System.out.println("3.Sort by Address ");
            System.out.println("4.Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    Collections.sort(ar, new Sortbyroll());
                    System.out.println("\nSorted by rollno");
                    for (int i = 0; i < ar.size(); i++)
                        System.out.println(ar.get(i));
                    break;

                case 2:
                    Collections.sort(ar, new Sortbyname());
                    System.out.println("\nSorted by name");
                    for (int i = 0; i < ar.size(); i++)
                        System.out.println(ar.get(i));
                    break;

                case 3:
                    Collections.sort(ar, new Sortbyaddress());
                    System.out.println("\nSorted by address");
                    for (int i = 0; i < ar.size(); i++)
                        System.out.println(ar.get(i));
                    break;

                case 4:
                    System.out.println("Exiting program");
                    scanner.close(); // Close the scanner
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
    }
}

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class Sortbyaddress implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.address.compareTo(b.address);
    }

}

