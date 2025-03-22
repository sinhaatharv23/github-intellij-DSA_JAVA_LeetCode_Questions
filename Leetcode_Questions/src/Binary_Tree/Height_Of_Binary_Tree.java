package Binary_Tree;
import java.util.*;
import Binary_Tree.Node.*;
class solution{
    Node root;
    public int count_height(Node root){
        if (root==null) return 0;
        int level =0;
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node front = queue.poll();
                if (front.left!=null){
                    queue.offer(front.left);
                }if (front.right!=null){
                    queue.offer(front.right);
                }
            }
            level++;
        }
        return level;
    }
    public Node insert(Node root,int data,Scanner sc){
        if (root==null){
            return new Node(data);
        }
        System.out.println("Enter L/l for left insertion or R/r for right insertion of "+data+" for:- "+root.data);
        char ch = sc.next().charAt(0);
        if (ch=='L'||ch=='l'){
            root.left=insert(root.left,data,sc);
        } else if (ch=='R'||ch=='r') {
            root.right=insert(root.right,data,sc);
        }else{
            System.out.println("Sorry!Wrong choice");
        }
        return root;
    }
}
public class Height_Of_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        solution s = new solution();
        while (true) {
            System.out.println("Pick up one choice:- ");
            System.out.println("1.)Insert");
            System.out.println("2.)Height");
            System.out.println("3.)Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:- ");
                    int data = sc.nextInt();
                    s.root = s.insert(s.root, data, sc);
                    break;
                case 2:
                    System.out.println("The height of the tree is:- " + s.count_height(s.root));
                    break;
                case 3:
                    System.out.println("Exiting....\nExited sucessfully");
                    return;
                default:
                    System.out.println("Invalid!!! Try again");
            }
        }
    }
}