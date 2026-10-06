import java.util.*;

public class Graph {

    // =========================
    // GRAPH
    // =========================

    static Map<Integer, List<Integer>> graph = new HashMap<>();


    // =========================
    // ADD VERTEX
    // =========================

    static void addVertex(int vertex) {

        if (!graph.containsKey(vertex)) {

            graph.put(vertex, new ArrayList<>());

            System.out.println("Vertex added: " + vertex);

        } else {

            System.out.println("Vertex already exists.");
        }
    }


    // =========================
    // ADD EDGE
    // =========================

    static void addEdge(int vertex1, int vertex2) {

        if (!graph.containsKey(vertex1)) {
            addVertex(vertex1);
        }

        if (!graph.containsKey(vertex2)) {
            addVertex(vertex2);
        }

        graph.get(vertex1).add(vertex2);
        graph.get(vertex2).add(vertex1);

        System.out.println("Edge added: " + vertex1 + " - " + vertex2);
    }


    // =========================
    // DISPLAY GRAPH
    // =========================

    static void displayGraph() {

        System.out.println();
        System.out.println("Graph:");

        for (int vertex : graph.keySet()) {

            System.out.print(vertex + " -> ");

            for (int neighbour : graph.get(vertex)) {

                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }


    // =========================
    // BFS
    // =========================

    static void BFS(int start) {

        if (!graph.containsKey(start)) {

            System.out.println("Vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);

                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }


    // =========================
    // DFS
    // =========================

    static void DFS(int start) {

        if (!graph.containsKey(start)) {

            System.out.println("Vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS: ");

        dfsRecursive(start, visited);

        System.out.println();
    }


    // DFS RECURSION
    static void dfsRecursive(int vertex, Set<Integer> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for (int neighbour : graph.get(vertex)) {

            if (!visited.contains(neighbour)) {

                dfsRecursive(neighbour, visited);
            }
        }
    }


    // =========================
    // MAIN
    // =========================

    public static void main(String[] args) {

        System.out.println("===== GRAPH =====");

        // ADD VERTICES
        addVertex(1);
        addVertex(2);
        addVertex(3);
        addVertex(4);


        // ADD EDGES
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 4);


        // DISPLAY
        displayGraph();


        // BFS
        System.out.println();

        System.out.println("BREADTH FIRST SEARCH");

        BFS(1);


        // DFS
        System.out.println();

        System.out.println("DEPTH FIRST SEARCH");

        DFS(1);
    }
}
