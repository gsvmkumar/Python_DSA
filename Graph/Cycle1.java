import java.util.*;

public class Cycle1 {

    boolean isCycle(List<List<Integer>> graph, int n) {
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (dfs(graph, i, -1, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean dfs(List<List<Integer>> graph, int node, int parent, boolean[] vis) {
        vis[node] = true;

        for (int nei : graph.get(node)) {
            if (!vis[nei]) {
                if (dfs(graph, nei, node, vis)) {
                    return true;
                }
            } else if (nei != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        Cycle1 obj = new Cycle1();

        if (obj.isCycle(graph, n)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}