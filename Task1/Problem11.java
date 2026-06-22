class Node {
    int data;
    Node right;
    Node down;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.down = null;
    }
}

public class Problem11 {

    public static Node create2DLinkedList(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        Node[][] nodes = new Node[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                nodes[i][j] = new Node(arr[i][j]);
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(j<cols-1) {
                    nodes[i][j].right = nodes[i][j+1];
                }
                if(i<rows-1) {
                    nodes[i][j].down = nodes[i+1][j];
                }
            }
        }
        return nodes[0][0];
    }

    public static void display(Node head) {
        Node row = head;

        while(row != null) {
            Node cur = row;

            while(cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.right;
            }

            System.out.println();
            row = row.down;
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Node head = create2DLinkedList(arr);

        System.out.println("2D Linked List:");
        display(head);
    }
}