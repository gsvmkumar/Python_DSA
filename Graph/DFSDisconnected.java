package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DFSDisconnected {

    public static List<Integer> dfs(GraphList g) {
        HashMap<Integer, ArrayList<Integer>> graph = g.getGraph();
        boolean[] visited = new boolean[g.getVertices()];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < g.getVertices(); i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited, result);
            }
        }

        return result;
    }

    private static void dfsUtil(HashMap<Integer, ArrayList<Integer>> graph,
                                int node,
                                boolean[] visited,
                                List<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfsUtil(graph, neighbour, visited, result);
            }
        }
    }
}