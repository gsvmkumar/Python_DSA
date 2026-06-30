package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static List<Integer> bfs(GraphList g, int source) {

        HashMap<Integer, ArrayList<Integer>> graph = g.getGraph();
        boolean[] visited = new boolean[g.getVertices()];
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(source);
        visited[source] = true;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            result.add(curr);
            for (int neighbour : graph.get(curr)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);

                }
            }
        }
        return result;
    }
}