package Graphs;

public class GraphAdjMatrix {

    private int[][] matrix;
    private int vertices;

    public GraphAdjMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;   // Undirected Graph
    }

    public void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }

    public void printGraph() {

        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphAdjMatrix graph = new GraphAdjMatrix(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);

        graph.printGraph();
    }
}