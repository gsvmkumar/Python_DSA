import java.util.*;
public class Kahns{
    List<Integer> toposort(int n,List<List<Integer>> g){
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int j:g.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int i:g.get(node)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
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
        }
        Kahns obj=new Kahns();
        List<Integer> res=obj.toposort(n,g);
        for(int i:res){
            System.out.print(i+" ");
        }
    }

}