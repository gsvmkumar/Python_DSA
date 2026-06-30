package Graph;
import java.util.*;
public class DSU2 {
    int parent[],n,components;
    DSU2(int n){
        parent = new int[n];
        this.n = n;
        this.components = n;
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
            parent[x] = y;
            components--;
        }
    }
    int getComponents(){
        return components;
    }
    void printComponents(){
        Map<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            hm.computeIfAbsent(root, new ArrayList<>());
            hm.get(root).add(i);
        }
        System.out.println("Components:");
        for (Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            System.out.println("Root: " + entry.getKey() + ", Members: " + entry.getValue());
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DSU2 dsu=new DSU2(n);
        while(true){
            System.out.println("1 to create a relationship\n2 to Execute query\n3 to how many groups");
            System.out.println("4 persons in the group\n5 to get you components\n6 to exit");


            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    dsu.union(a,b);
                    break;
                case 2:
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    System.out.println("Enter values to find the relation ship x and y");
                    if(dsu.find(x)==dsu.find(y)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    break;
                case 3:
                    System.out.println("Number of groups: " + dsu.getComponents());
                    break;
                case 4:
                        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

                        for (int i = 0; i<n; i++) {
                            int k = dsu.find(i);
                            if (!map.containsKey(k)) {
                                map.put(k, new ArrayList<>());
                            }
                            map.get(k).add(i);
                        }
                        System.out.println("Persons in each group:");
                        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                            System.out.println("Parent : " + entry.getKey());
                            System.out.println("Persons : " + entry.getValue());
                            System.out.println();
                        }

                        break;
                case 5:
                    HashMap<Integer, ArrayList<Integer>> map1 = new HashMap<>();

                    for (int i = 0; i<n; i++) {
                        int k = dsu.find(i);
                        if (!map1.containsKey(k)) {
                                map1.put(k, new ArrayList<>());
                        }
                        map1.get(k).add(i);
                    }
                    System.out.println("Enter the component to search the group:");
                    int component = sc.nextInt();
                    System.out.println("Persons in group " + component + ": " + map1.get(component));
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
