# CIT300-DSA-Assignment-2

## CIT300 Data Structures and Algorithms – Assignment 2

A Java console-based application demonstrating fundamental Data Structures and Algorithms.

## Project Overview

This project demonstrates the implementation and usage of:

* Array
* Linear Search
* Binary Search
* Stack
* Queue
* Linked List
* Graph
* Breadth First Search (BFS)
* Depth First Search (DFS)
* Input Validation
* Performance and Time Complexity

## Project Structure

```text
CIT300-DSA-Assignment-2
│
├── Main.java
├── ArraySearching.java
├── StackQueue.java
├── MyLinkedList.java
├── Graph.java
└── README.md
```

## Data Structures and Algorithms

### 1. Array and Searching

Implemented operations:

* Insert
* Delete
* Display
* Linear Search
* Binary Search

Time Complexity:

* Array Access: O(1)
* Linear Search: O(n)
* Binary Search: O(log n)

### 2. Stack

Implemented using an array.

Operations:

* Push
* Pop
* Peek
* Display

Time Complexity:

* Push: O(1)
* Pop: O(1)

### 3. Queue

Implemented using an array.

Operations:

* Enqueue
* Dequeue
* Peek
* Display

Time Complexity:

* Enqueue: O(1)
* Dequeue: O(1)

### 4. Linked List

Implemented using nodes.

Operations:

* Insert
* Search
* Delete
* Display

Time Complexity:

* Search: O(n)

### 5. Graph

Implemented using an adjacency list.

Operations:

* Add Vertex
* Add Edge
* Display Graph
* BFS
* DFS

Time Complexity:

* BFS: O(V + E)
* DFS: O(V + E)

Where:

* V = Number of vertices
* E = Number of edges

## Main Program

`Main.java` integrates all data structures into one console application.

The main menu provides:

```text
1. Array & Searching
2. Stack
3. Queue
4. Linked List
5. Graph
6. Performance & Complexity
7. Run All
0. Exit
```

The program also includes basic input validation for menu and numeric inputs.

## Performance

The program includes a simple performance demonstration using `System.nanoTime()` to compare Linear Search and Binary Search execution times.

## Technologies Used

* Java
* VS Code
* Git
* GitHub

## Team Members and Contributions

| Member   | Student ID | Name               | Contribution                                |
| -------- | ---------- | ------------------ | ------------------------------------------- |
| Member 1 | 23DA2-1176 | M.J.Kalith Mish_al | Array, Searching, Performance & Integration |
| Member 2 | 23DA2-0672 | S.A.H. Kurzith     | Stack and Queue                             |
| Member 3 | 23DA2-0483 | M.I.M.Shihab       | Linked List                                 |
| Member 4 | 23DA2-0549 | M. S. F. Rinoza    | Graph, BFS and DFS                          |

## How to Run

### 1. Compile

```bash
javac *.java
```

### 2. Run

```bash
java Main
```

### 3. Select an Option

Enter a number from `0` to `7` from the Main Menu.

## GitHub Collaboration

The project was developed collaboratively using GitHub branches and pull requests.

Each member worked on their assigned data structure and contributed code to the project.

### Branches Used

* `member1-array-searching`
* `member2-stack-queue`
* `member3-linked-list`
* `member4-graph`
* `main`

The completed contributions were integrated into the `main` branch.

## Testing

The complete application was compiled and tested successfully using:

```bash
javac *.java
java Main
```

The `Run All` option was also tested to verify:

* Array operations
* Linear Search
* Binary Search
* Stack operations
* Queue operations
* Linked List operations
* Graph operations
* BFS
* DFS
* Performance measurement
* Time complexity information

## Conclusion

This project demonstrates the practical implementation of fundamental Data Structures and Algorithms using Java.

It also demonstrates searching techniques, graph traversal, input validation, performance measurement, object-oriented program structure, and GitHub-based collaboration.
