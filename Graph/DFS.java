package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    private ArrayList<Integer> traversalOrder;

    public DFS() {
        traversalOrder = new ArrayList<>();
    }

    public void traverse(Graph1 graph, int start) {

        boolean[] visited = new boolean[graph.getVertices()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (!visited[node]) {

                visited[node] = true;
                traversalOrder.add(node);

                int[][] matrix = graph.getAdjMatrix();

                for (int i = graph.getVertices() - 1; i >= 0; i--) {

                    if (matrix[node][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public ArrayList<Integer> getTraversalOrder() {
        return traversalOrder;
    }

    public void display() {
        System.out.print("DFS Traversal: ");

        for (int node : traversalOrder) {
            System.out.print(node + " ");
        }

        System.out.println();
    }
}