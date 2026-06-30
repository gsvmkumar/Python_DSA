package Undirected;

public class Graph1 {

    private int V;
    private int[][] adjMatrix;

    public Graph1(int v) {
        V = v;
        adjMatrix = new int[v][v];
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    public int getVertices() {
        return V;
    }
    public void displayMatrix() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}