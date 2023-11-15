import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to delete a given element from the list
    public void deleteElement(int key) {
        Node current = head;

        // Find the node with the given key
        while (current != null && current.data != key) {
            current = current.next;
        }

        // If the key is not found
        if (current == null) {
            System.out.println("Element " + key + " not found in the list.");
            return;
        }

        // Adjust the pointers to remove the node
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            // If the element to be deleted is the head
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Method to display the elements of the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class double_linkedlist{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        int choice;
        do {
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int insertElement = scanner.nextInt();
                    doublyLinkedList.insertAtEnd(insertElement);
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    int deleteElement = scanner.nextInt();
                    doublyLinkedList.deleteElement(deleteElement);
                    break;

                case 3:
                    System.out.println("List:");
                    doublyLinkedList.display();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 4);
        
        scanner.close();
    }
}
