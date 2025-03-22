package Binary_Tree;
import Binary_Tree.Node;
import java.util.*;
class Binary_Tree{
    Node root;
    public Node insert_Node(Node root,int data,Scanner sc){
        if (root==null){
            return new Node(data);
        }
        System.out.println("Enter L/l for left and R/r for right to insert data "+data+" of "+root.data);
        char s = sc.next().charAt(0);
        if (s=='L'||s=='l'){
            root.left=insert_Node(root.left,data,sc);
        }else if (s=='R'||s=='r'){
            root.right=insert_Node(root.right,data,sc);
        } else {
            System.out.println("Wrong choice!!");
        }
        return root;
    }
    public List<List<Integer>> LevelOrder_Traversal(Node root){
        Queue<Node>queue = new LinkedList<Node>();
        List<List<Integer>>wrapList = new LinkedList<List<Integer>>();
        if (root==null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer>sublist= new LinkedList<Integer>();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}
public class Level_Order_Traversal {
    public static void main(String[] args) {
        Binary_Tree b_tree = new Binary_Tree();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Pick up one choice:- ");
            System.out.println("1.)Insert");
            System.out.println("2.)Traverse Levelorder");
            System.out.println("3.)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:- ");
                    int data = sc.nextInt();
                    b_tree.root = b_tree.insert_Node(b_tree.root, data,sc);
                    break;
                case 2:
                    List<List<Integer>> result = b_tree.LevelOrder_Traversal(b_tree.root);
                    System.out.println(result);
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