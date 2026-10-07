public class MyLinkedList {

    // NODE

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // HEAD
    static Node head = null;


    // INSERT

    static void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    // SEARCH

    static boolean search(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    // DELETE

    static void delete(int value) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Delete first node
        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted.");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {

                current.next = current.next.next;

                System.out.println(value + " deleted.");
                return;
            }

            current = current.next;
        }

        System.out.println(value + " not found.");
    }


    // DISPLAY

    static void display() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }

  
    // MAIN

    public static void main(String[] args) {

        System.out.println("===== LINKED LIST =====");

        // INSERT
        insert(10);
        insert(20);
        insert(30);
        insert(40);

        display();


        // SEARCH
        System.out.println();

        System.out.println("SEARCH");

        if (search(30)) {
            System.out.println("30 found.");
        } else {
            System.out.println("30 not found.");
        }


        // DELETE
        System.out.println();

        System.out.println("DELETE");

        delete(20);

        display();
    }
}


