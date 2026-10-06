public class Main {

    public static void main(String[] args) {

        System.out.println("===== CIT300 DSA ASSIGNMENT 2 =====");

        System.out.println("\n===== ARRAY & SEARCHING =====");
        ArraySearching.insert(10);
        ArraySearching.insert(20);
        ArraySearching.insert(30);
        ArraySearching.insert(40);
        ArraySearching.insert(50);
        ArraySearching.display();

        System.out.println("Linear Search: " + ArraySearching.linearSearch(30));
        System.out.println("Binary Search: " + ArraySearching.binarySearch(40));

        System.out.println("\n===== STACK =====");
        StackQueue.push(10);
        StackQueue.push(20);
        StackQueue.push(30);
        StackQueue.displayStack();
        StackQueue.peekStack();
        StackQueue.pop();
        StackQueue.displayStack();

        System.out.println("\n===== QUEUE =====");
        StackQueue.enqueue(100);
        StackQueue.enqueue(200);
        StackQueue.enqueue(300);
        StackQueue.displayQueue();
        StackQueue.peekQueue();
        StackQueue.dequeue();
        StackQueue.displayQueue();

        System.out.println("\n===== LINKED LIST =====");
        MyLinkedList.insert(10);
        MyLinkedList.insert(20);
        MyLinkedList.insert(30);
        MyLinkedList.insert(40);
        MyLinkedList.display();

        System.out.println("Search 30: " + MyLinkedList.search(30));

        MyLinkedList.delete(20);
        MyLinkedList.display();

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

        Graph.BFS(1);
        Graph.DFS(1);

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}