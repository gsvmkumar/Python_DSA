package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphList {

    private HashMap<Integer, ArrayList<Integer>> graph;
    private int vertices;

    public GraphList(int vertices) {

        this.vertices = vertices;
        graph = new HashMap<>();

        for (int i = 0; i < vertices; i++) {
            graph.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void display() {

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int x : graph.get(i))
                System.out.print(x + " ");

            System.out.println();
        }
    }

    public HashMap<Integer, ArrayList<Integer>> getGraph() {
        return graph;
    }

    public int getVertices() {
        return vertices;
    }
}