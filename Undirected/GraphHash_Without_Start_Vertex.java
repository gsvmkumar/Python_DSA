import java.util.*;
public class GraphHash_Without_Start_Vertex {
    HashMap<Integer,List<Integer>>hm;
    List<Integer>l;
    int n;
    GraphHash_Without_Start_Vertex(int n){
        this.n=n;
        hm=new HashMap<>();
        for(int i=0;i<n;i++){
        hm.put(i,new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        hm.get(u).add(v);
    }
    public void display(){
        for(int i:hm.keySet()){
            System.out.print(i+"-"+hm.get(i));
            System.out.println();
        }
    }
    public void dfs1(int s,boolean visited[],List<Integer>res){
        res.add(s);
        visited[s]=true;
        for(int i:hm.get(s)){
            if(!visited[i]){
                dfs1(i,visited,res);
            }
        }
    }
    public List<Integer> dfs(){
        boolean visited[] = new boolean[n];
        List<Integer>res=new ArrayList<>();
        for (int i = 0; i<n;i++){
            if(!visited[i]){
                dfs1(i,visited,res);
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        GraphHash_Without_Start_Vertex g=new GraphHash_Without_Start_Vertex(n);
        while(true){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.addEdge(u, v);
            System.out.print("Enter -1 to exit:");
            int x=sc.nextInt();
            if(x==-1){
                break;
            }
        }
       List<Integer> ans = g.dfs();
       for (int x : ans){
        System.out.println(x+" ");
       }
    }
}