import java.util.*;
public class Biparite1 {
    boolean isBipartite(List<List<Integer>> g,int n){
        int color[] = new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(dfs(g,i,0,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(List<List<Integer>> graph,int s,int col,int color[]){
        color[s] = col;
        for(int i:graph.get(s)){
            if(color[i]==-1){
                if(dfs(graph,i,1-col,color)==false){
                    return false;
                }
            }
            else if(color[i]==col){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        Biparite1 b=new Biparite1();
        if(b.isBipartite(g,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
