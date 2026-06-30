package Graph;

public class DSU3 {
    int parent[],n;
    int rank[];
    DSU3(int n){
        parent = new int[n];
        rank = new int[n];
        this.n = n;
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }
    int find(int i){
        if(i==parent[i]){
            return i;
        }
        return find(parent[i]);
    }
    void union(int i,int j){
        int x = find(i);
        int y = find(j);
        if(x!=y){
            if(rank[x]<rank[y]){
                parent[x] = y;
            }
            else if(rank[x]>rank[y]){
                parent[y] = x;
            }
            else{
                parent[x] = y;
                rank[y]++;
            }
        }
    }
}
