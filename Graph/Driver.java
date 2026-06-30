package Graph;

import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        GraphList g = new GraphList(n);
        /*
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(4, 6);
        */
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }
        // List<Integer> ans = DFS.dfs(g,0);
        List<Integer> ans = BFS.bfs(g,0);
        System.out.println(ans);
    }
}