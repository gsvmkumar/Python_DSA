import java.util.*;

public class Empee {

    static class DSU {
        int[] parent;
        int[] rank;
        int[] size;

        DSU(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];
            size = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if (px == py)
                return;

            if (rank[px] < rank[py]) {
                parent[px] = py;
                size[py] += size[px];
            } else if (rank[px] > rank[py]) {
                parent[py] = px;
                size[px] += size[py];
            } else {
                parent[py] = px;
                rank[px]++;
                size[px] += size[py];
            }
        }

        int getCompanyLeader(int x) {
            return find(x);
        }

        int getCompanySize(int x) {
            return size[find(x)];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        DSU dsu = new DSU(n);

        while (q-- > 0) {

            int type = sc.nextInt();

            if (type == 1) {

                int x = sc.nextInt();
                int y = sc.nextInt();

                dsu.union(x, y);

            } else if (type == 2) {

                int x = sc.nextInt();

                System.out.println(dsu.getCompanyLeader(x));

            } else if (type == 3) {

                int x = sc.nextInt();

                System.out.println(dsu.getCompanySize(x));
            }
        }

        sc.close();
    }
}