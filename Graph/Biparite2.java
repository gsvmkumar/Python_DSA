import java.util.*;

public class Biparite2 {

    boolean isBipartite(List<List<Integer>> g, int n) {
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfs(g, i, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean bfs(List<List<Integer>> graph, int s, int[] color) {
        Queue<Integer> qu = new LinkedList<>();

        qu.offer(s);
        color[s] = 0;

        while (!qu.isEmpty()) {
            int node = qu.poll();

            for (int nei : graph.get(node)) {
                if (color[nei] == -1) {
                    color[nei] = 1 - color[node];
                    qu.offer(nei);
                } else if (color[nei] == color[node]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> g = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.get(u).add(v);
            g.get(v).add(u);
        }

        Biparite2 b = new Biparite2();

        if (b.isBipartite(g, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}