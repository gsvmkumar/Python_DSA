package Graph;
import java.util.*;
public class DSU {
    int parent[],n;
    DSU(int n){
        parent = new int[n];
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
        if(x!=y)
            parent[x] = y;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DSU dsu=new DSU(n);
        while(true){
            System.out.println("1 to create a relationship\n2 to Execute query\n3 to how many groups");
            System.out.println("4 persons in the group\n5 to find the group of a person\n6 to exit");


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
                    HashSet<Integer> set=new HashSet<>();
                    for(int i=0;i<n;i++)
                        set.add(dsu.find(i));
                    System.out.println("Number of groups: "+set.size());
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
                        for (int i = 0; i < n; i++) {
                            int k = dsu.find(i);
                            if (!map1.containsKey(k)) {
                                map1.put(k, new ArrayList<>());
                            }
                            map1.get(k).add(i);
                        }
                        System.out.print("Enter person: ");
                        int person = sc.nextInt();
    
                        if(person < 0 || person >= n){
                            System.out.println("Invalid person");
                            break;
                        }
                        int component = dsu.find(person);
                        System.out.println("Group Parent : " + component);
                        System.out.println("Persons : " + map1.get(component));

                        break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
