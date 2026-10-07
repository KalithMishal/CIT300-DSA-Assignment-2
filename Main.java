import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     CIT300 DSA ASSIGNMENT 2");
        System.out.println("======================================");

        boolean running = true;

        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Array & Searching");
            System.out.println("2. Stack");
            System.out.println("3. Queue");
            System.out.println("4. Linked List");
            System.out.println("5. Graph");
            System.out.println("6. Performance & Complexity");
            System.out.println("7. Run All");
            System.out.println("0. Exit");
            System.out.println("===============================");

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayDemo();
                    break;

                case 2:
                    stackDemo();
                    break;

                case 3:
                    queueDemo();
                    break;

                case 4:
                    linkedListDemo();
                    break;

                case 5:
                    graphDemo();
                    break;

                case 6:
                    performanceDemo();
                    break;

                case 7:
                    runAll();
                    break;

                case 0:
                    running = false;
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 0 - 7.");
            }
        }

        scanner.close();
    }


    // ==============================
    // INPUT VALIDATION
    // ==============================

    static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {

                return scanner.nextInt();

            } else {

                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }


    // ==============================
    // ARRAY & SEARCHING
    // ==============================

    static void arrayDemo() {

        System.out.println("\n===== ARRAY & SEARCHING =====");

        ArraySearching.insert(10);
        ArraySearching.insert(20);
        ArraySearching.insert(30);
        ArraySearching.insert(40);
        ArraySearching.insert(50);

        ArraySearching.display();

        int value = readInt("Enter value to search: ");

        int result = ArraySearching.linearSearch(value);

        if (result != -1) {
            System.out.println("Linear Search: " + value +
                    " found at index " + result);
        } else {
            System.out.println("Linear Search: " + value + " not found.");
        }

        result = ArraySearching.binarySearch(value);

        if (result != -1) {
            System.out.println("Binary Search: " + value +
                    " found at index " + result);
        } else {
            System.out.println("Binary Search: " + value + " not found.");
        }
    }


    // ==============================
    // STACK
    // ==============================

    static void stackDemo() {

        System.out.println("\n===== STACK =====");

        StackQueue.push(10);
        StackQueue.push(20);
        StackQueue.push(30);

        StackQueue.displayStack();

        StackQueue.peekStack();

        StackQueue.pop();

        StackQueue.displayStack();
    }


    // ==============================
    // QUEUE
    // ==============================

    static void queueDemo() {

        System.out.println("\n===== QUEUE =====");

        StackQueue.enqueue(100);
        StackQueue.enqueue(200);
        StackQueue.enqueue(300);

        StackQueue.displayQueue();

        StackQueue.peekQueue();

        StackQueue.dequeue();

        StackQueue.displayQueue();
    }


    // ==============================
    // LINKED LIST
    // ==============================

    static void linkedListDemo() {

        System.out.println("\n===== LINKED LIST =====");

        MyLinkedList.insert(10);
        MyLinkedList.insert(20);
        MyLinkedList.insert(30);
        MyLinkedList.insert(40);

        MyLinkedList.display();

        int value = readInt("Enter value to search: ");

        if (MyLinkedList.search(value)) {
            System.out.println(value + " found.");
        } else {
            System.out.println(value + " not found.");
        }

        int deleteValue = readInt("Enter value to delete: ");

        MyLinkedList.delete(deleteValue);

        MyLinkedList.display();
    }


    // ==============================
    // GRAPH
    // ==============================

    static void graphDemo() {

        System.out.println("\n===== GRAPH =====");

        Graph.addVertex(1);
        Graph.addVertex(2);
        Graph.addVertex(3);
        Graph.addVertex(4);

        Graph.addEdge(1, 2);
        Graph.addEdge(1, 3);
        Graph.addEdge(2, 4);
        Graph.addEdge(3, 4);

        Graph.displayGraph();

        System.out.println("\nBREADTH FIRST SEARCH");
        Graph.BFS(1);

        System.out.println("\nDEPTH FIRST SEARCH");
        Graph.DFS(1);
    }


    // ==============================
    // PERFORMANCE & COMPLEXITY
    // ==============================

    static void performanceDemo() {

        System.out.println("\n===== PERFORMANCE & COMPLEXITY =====");

        int repetitions = 100000;

        int searchValue = 50;

        long startTime = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            ArraySearching.linearSearch(searchValue);
        }

        long linearTime = System.nanoTime() - startTime;


        startTime = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            ArraySearching.binarySearch(searchValue);
        }

        long binaryTime = System.nanoTime() - startTime;


        System.out.println("\nPerformance Test");
        System.out.println("-------------------------");

        System.out.println("Linear Search time: "
                + linearTime + " ns");

        System.out.println("Binary Search time: "
                + binaryTime + " ns");

        System.out.println("\nTime Complexity");
        System.out.println("-------------------------");

        System.out.println("Array Access       : O(1)");
        System.out.println("Linear Search      : O(n)");
        System.out.println("Binary Search      : O(log n)");
        System.out.println("Stack Push         : O(1)");
        System.out.println("Stack Pop          : O(1)");
        System.out.println("Queue Enqueue      : O(1)");
        System.out.println("Queue Dequeue      : O(1)");
        System.out.println("Linked List Search : O(n)");
        System.out.println("Graph BFS          : O(V + E)");
        System.out.println("Graph DFS          : O(V + E)");
    }


    // ==============================
    // RUN ALL
    // ==============================

    static void runAll() {

        System.out.println("\n======================================");
        System.out.println("          RUNNING ALL TESTS");
        System.out.println("======================================");

        System.out.println("\n1. ARRAY & SEARCHING");

        ArraySearching.insert(10);
        ArraySearching.insert(20);
        ArraySearching.insert(30);
        ArraySearching.insert(40);
        ArraySearching.insert(50);

        ArraySearching.display();

        System.out.println("Linear Search 30: "
                + ArraySearching.linearSearch(30));

        System.out.println("Binary Search 40: "
                + ArraySearching.binarySearch(40));


        System.out.println("\n2. STACK");

        StackQueue.push(10);
        StackQueue.push(20);
        StackQueue.push(30);

        StackQueue.displayStack();

        StackQueue.pop();

        StackQueue.displayStack();


        System.out.println("\n3. QUEUE");

        StackQueue.enqueue(100);
        StackQueue.enqueue(200);
        StackQueue.enqueue(300);

        StackQueue.displayQueue();

        StackQueue.dequeue();

        StackQueue.displayQueue();


        System.out.println("\n4. LINKED LIST");

        MyLinkedList.insert(10);
        MyLinkedList.insert(20);
        MyLinkedList.insert(30);
        MyLinkedList.insert(40);

        MyLinkedList.display();


        System.out.println("\n5. GRAPH");

        Graph.addVertex(1);
        Graph.addVertex(2);
        Graph.addVertex(3);
        Graph.addVertex(4);

        Graph.addEdge(1, 2);
        Graph.addEdge(1, 3);
        Graph.addEdge(2, 4);
        Graph.addEdge(3, 4);

        Graph.displayGraph();

        Graph.BFS(1);
        Graph.DFS(1);


        System.out.println("\n6. PERFORMANCE");

        performanceDemo();

        System.out.println("\n======================================");
        System.out.println("       ALL TESTS COMPLETED");
        System.out.println("======================================");
    }
}