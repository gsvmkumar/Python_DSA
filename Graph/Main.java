package DSA.Graph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        Graph1 graph = new Graph1(n);

        int choice = 0;

        while (choice != -1) {

            System.out.print("Enter source: ");
            int src = sc.nextInt();

            System.out.print("Enter destination: ");
            int dest = sc.nextInt();

            graph.addEdge(src, dest);

            System.out.print("Enter choice (-1 to stop): ");
            choice = sc.nextInt();
        }

        DFS dfs = new DFS();

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        dfs.traverse(graph, start);

        dfs.display();

        System.out.println(dfs.getTraversalOrder());

        sc.close();
    }
}